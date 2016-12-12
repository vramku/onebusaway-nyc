package org.onebusaway.nyc.transit_data_federation.impl.predictions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.onebusaway.container.refresh.Refreshable;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.nyc.transit_data.services.NycTransitDataService;
import org.onebusaway.nyc.transit_data_federation.impl.queue.TimeQueueListenerTask;
import org.onebusaway.nyc.transit_data_federation.services.predictions.PredictionCacheService;
import org.onebusaway.nyc.transit_data_federation.services.predictions.PredictionIntegrationService;
import org.onebusaway.nyc.util.configuration.ConfigurationService;
import org.onebusaway.realtime.api.TimepointPredictionRecord;
import org.onebusaway.transit_data.model.VehicleStatusBean;
import org.onebusaway.transit_data.model.blocks.BlockInstanceBean;
import org.onebusaway.transit_data.model.blocks.BlockStopTimeBean;
import org.onebusaway.transit_data.model.blocks.BlockTripBean;
import org.onebusaway.transit_data.model.trips.TripStatusBean;
import org.onebusaway.transit_data_federation.services.AgencyAndIdLibrary;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.TripUpdate;
import com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate;

/**
 * Listen for (queue), cache, and return time predictions.
 * 
 * @author sheldonabrown
 *
 */
public class QueuePredictionIntegrationServiceImpl extends
		TimeQueueListenerTask implements PredictionIntegrationService {

	private static final int DEFAULT_CACHE_TIMEOUT = 2 * 60; // seconds
	private static final String CACHE_TIMEOUT_KEY = "tds.prediction.expiry";

	private static final String DEFAULT_STOP_ID = "981010";
	private static final String DEFAULT_VEHICLE_ID = "6379";
	private static final String DEFAULT_FALSE = "false";
	private static final String DEFAULT_TRUE = "true";

	private static final String LOG_VEHICLE_ID = "tds.prediction.logVehicleId";
	private static final String LOG_STOP_ID = "tds.prediction.logStopId";
	private static final String LOG_QUEUE_COUNT = "tds.prediction.enableLogQueueCount";
	private static final String LOG_SHOW_BLOCK_TRIPS = "tds.prediction.showBlockTrips";

	private static final String PREDICTION_AGE_LIMT = "display.predictionAgeLimit";
	private static final String CHECK_PREDICTION_AGE = "display.checkPredictionAge";
	private static final String CHECK_PREDICTION_LATENCY = "display.checkPredictionLatency";
	
	 private static final long MESSAGE_WAIT_MILLISECONDS = 1 * 1000;

	private static String _vehicleId;
	private static String _stopId;
	private Boolean _enableQueueCount;
	private Boolean _showBlockTrips;
	private Boolean _checkPredictionAge;
	private Boolean _checkPredictionLatency;
	private Integer _predictionAgeLimit = 300;
	private int _predictionResultThreads = 5;

	Date markTimestamp = new Date();
	int processedCount = 0;
	int _countInterval = 10000;
	
	private Map<String, Integer> instanceCountMap = new HashMap<String, Integer>();
	private Map<String, Long> avgLatencyMap = new HashMap<String, Long>();
	private ArrayBlockingQueue<FeedMessage> _predictionMessageQueue = new ArrayBlockingQueue<FeedMessage>(
		      1000000);
	
	private ExecutorService _predictionExecutorService;
	private Future<?> _predictionThreadFuture;
	


	@Autowired
	private NycTransitDataService _transitDataService;

	@Autowired
	private ConfigurationService _configurationService;
	
	@Autowired
	private PredictionCacheService _cacheService;

	private Cache<String, List<TimepointPredictionRecord>> getCache() {
		return _cacheService.getCache();
	}

	@Refreshable(dependsOn = { LOG_VEHICLE_ID, LOG_STOP_ID, LOG_QUEUE_COUNT,
			LOG_SHOW_BLOCK_TRIPS, CHECK_PREDICTION_LATENCY,
			CHECK_PREDICTION_AGE, PREDICTION_AGE_LIMT })
	private synchronized void refreshConfig() {
		_vehicleId = _configurationService.getConfigurationValueAsString(
				LOG_VEHICLE_ID, DEFAULT_VEHICLE_ID);
		_stopId = _configurationService.getConfigurationValueAsString(
				LOG_STOP_ID, DEFAULT_STOP_ID);
		_enableQueueCount = Boolean.parseBoolean(_configurationService
				.getConfigurationValueAsString(LOG_QUEUE_COUNT, DEFAULT_FALSE));
		_showBlockTrips = Boolean.parseBoolean(_configurationService
				.getConfigurationValueAsString(LOG_SHOW_BLOCK_TRIPS,
						DEFAULT_FALSE));
		_checkPredictionAge = Boolean.parseBoolean(_configurationService
				.getConfigurationValueAsString(CHECK_PREDICTION_AGE,
						DEFAULT_FALSE));
		_checkPredictionLatency = Boolean.parseBoolean(_configurationService
				.getConfigurationValueAsString(CHECK_PREDICTION_LATENCY,
						DEFAULT_FALSE));
		_predictionAgeLimit = Integer.parseInt(_configurationService
				.getConfigurationValueAsString(PREDICTION_AGE_LIMT, "300"));
	}
	
	@PostConstruct
	@Override
	public void setup() {
		super.setup();
		_predictionExecutorService = Executors.newFixedThreadPool(5);
		initializePredictionQueue();
	}
	
	public void initializePredictionQueue(){
		for (int i = 0; i < _predictionResultThreads; i++) {
			ProcessResultTask task = new ProcessResultTask(i);
			_predictionThreadFuture = _predictionExecutorService.submit(task);
		}
	}

	@Override
	protected void processResult(FeedMessage message) {
		try{
			boolean success = _predictionMessageQueue.offer(message, MESSAGE_WAIT_MILLISECONDS,
			        TimeUnit.MILLISECONDS);
			    if (!success)
			      _log.warn("QUEUE FULL, dropped message");
		}
		catch(Exception e){
			_log.error("Error occured when attempting to queue message");
		}
	}
	
    private class ProcessResultTask implements Runnable {
    	private int threadNumber;
    	private int predictionRecordCount = 0;
    	private int predictionRecordCountInterval = 2000;
    	private long predictionRecordAverageLatency = 0;
    	
    	public ProcessResultTask(int threadNumber) {
    		this.threadNumber = threadNumber;
    	}
    	
    	public void run() {
	    	while (!Thread.interrupted()) {
	    		 try {
	    			 
	    			 FeedMessage message =_predictionMessageQueue.poll();
	    			 
	    			 if(message != null){
		    			 if (enableCheckPredictionLatency()) {
		    				 logPredictionLatency(message);
		    			 }
		    			 
		    			 List<TimepointPredictionRecord> predictionRecords = new ArrayList<TimepointPredictionRecord>();  
	    		  	  	 Map<String, Long> stopTimeMap = new HashMap<String, Long>();
	    		  	  	 
	    		  	  	 String tripId = null;
	    		  	  	 String vehicleId = null;
	    		  	  	 
	    		  	  	 // convert FeedMessage to TimepointPredictionRecord
	    		  	  	 for (GtfsRealtime.FeedEntity entity : message.getEntityList()) {
	    		  		    
	    		  		    TripUpdate tu = entity.getTripUpdate();
	    		  		    if (!tu.getVehicle().getId().equals(vehicleId)
	    		  		        || !tu.getTrip().getTripId().equals(tripId)) {
	    		  		      stopTimeMap = loadScheduledTimes(tu.getVehicle().getId(), tu.getTrip().getTripId());
	    		  		    }
	    		  		    tripId = tu.getTrip().getTripId();
	    		  		    vehicleId = tu.getVehicle().getId();

	    		  		    for (StopTimeUpdate stu : tu.getStopTimeUpdateList()) {
	    		  		      TimepointPredictionRecord tpr = new TimepointPredictionRecord();
	    		  		      // this validates the Agency_StopID convention
	    		  		      tpr.setTimepointId(AgencyAndIdLibrary.convertFromString(stu.getStopId())); 
	    		  		      tpr.setTimepointPredictedTime(stu.getArrival().getTime());
	    		  		      Long scheduledTime = stopTimeMap.get(stu.getStopId());
	    		  		      
	    		  		      if (scheduledTime != null) {
	    		  		        tpr.setTimepointScheduledTime(scheduledTime);
	    		  		        predictionRecords.add(tpr);
	    		  		      }
	    		  		    }
	    		  		    
	    		  		    if (vehicleId != null) {
	    		  			    // place in cache if we were able to extract a vehicle id
	    		  			    getCache().put(hash(vehicleId, tripId), predictionRecords);
	    		  			} 
	    		  	  	 }
 
	    			 }
	    		 }
	    		 catch(Exception e){
	    			 _log.error("exception sending: ", e);
	    		 }
	    	}
    	}
    	
    	private void logPredictionLatency(FeedMessage message){
    		long currentTime = System.currentTimeMillis();
    		Long messageTimeStamp = message.getHeader().getTimestamp();
    		if (messageTimeStamp != null && messageTimeStamp > 0) {
				predictionRecordCount++;
				predictionRecordAverageLatency += (currentTime - messageTimeStamp);
				if (predictionRecordCount >= predictionRecordCountInterval) {
					String avgPredictionRecordLatencyAsText = getHumanReadableElapsedTime(predictionRecordAverageLatency
							/ predictionRecordCountInterval);
					_log.info("Average predictions message latency for predictions thread " + getThreadNumber() +  " is: "
							+ avgPredictionRecordLatencyAsText);
					predictionRecordCount = 0;
					predictionRecordAverageLatency = (long) 0;
				}
			}
    	}
    	
    	private String getHumanReadableElapsedTime(long timestamp) {
    		return String.format(
    				"%02d min, %02d sec",
    				TimeUnit.MILLISECONDS.toMinutes(timestamp),
    				TimeUnit.MILLISECONDS.toSeconds(timestamp)
    						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
    								.toMinutes(timestamp)));
    	}
    	
    	private Map<String, Long> loadScheduledTimes(String vehicleId, String tripId) {
    		
    		Map<String, Long> map = new HashMap<String, Long>();
    		VehicleStatusBean vehicleStatus = _transitDataService
    				.getVehicleForAgency(vehicleId, System.currentTimeMillis());

    		if (vehicleStatus == null) {
    			return map;
    		}

    		TripStatusBean tripStatus = vehicleStatus.getTripStatus();
    		if (tripStatus == null) {
    			return map;
    		}
    			
    		BlockInstanceBean blockInstance = _transitDataService.getBlockInstance(
    				tripStatus.getActiveTrip().getBlockId(),
    				tripStatus.getServiceDate());
    	
    		if (blockInstance == null) {
    			return map;
    		}

    		// we need to match the given trip to the active trip
    		List<BlockTripBean> blockTrips = blockInstance.getBlockConfiguration()
    				.getTrips();
    		boolean foundActiveTrip = false;
    		for (BlockTripBean blockTrip : blockTrips) {
    			if (!foundActiveTrip) {
    				if (tripId.equals(blockTrip.getTrip().getId())) {
    					for (BlockStopTimeBean bst : blockTrip.getBlockStopTimes()) {
    						map.put(bst.getStopTime().getStop().getId(),
    								tripStatus.getServiceDate()
    										+ (bst.getStopTime().getArrivalTime() * 1000));
    					}
    				}
    			}
    		}
    		
    		return map;
    	}
    	
    	public int getThreadNumber(){
    		return this.threadNumber;
    	}
    	
    	public void setThreadNumber(int threadNumber){
    		this.threadNumber = threadNumber;
    	}
    }
	
	@Override
	public void updatePredictionsForVehicle(AgencyAndId vehicleId) {
		// no op, messages come in from queue
	}

	private String hash(String vehicleId, String tripId) {
		return vehicleId + "-" + tripId;
	}
	
	private boolean enableCheckPredictionLatency() {
		if (_checkPredictionLatency == null) {
			refreshConfig();
		}
		return _checkPredictionLatency;
	}

	@Override
	  public List<TimepointPredictionRecord> getPredictionsForTrip(
	      TripStatusBean tripStatus) {
	    return getCache().getIfPresent(hash(tripStatus.getVehicleId(), tripStatus.getActiveTrip().getId()));
	}
	  
	public List<TimepointPredictionRecord> getPredictionRecordsForVehicleAndTrip(
	      String VehicleId, String TripId) {
		return getCache().getIfPresent(hash(VehicleId, TripId));
	}
}