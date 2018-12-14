/*
 * Copyright 2010, OpenPlans Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.onebusaway.nyc.presentation.impl.realtime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

import org.apache.commons.lang.StringUtils;

import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.nyc.presentation.impl.AgencySupportLibrary;
import org.onebusaway.nyc.presentation.service.realtime.PresentationService;
import org.onebusaway.nyc.siri.support.SiriDistanceExtension;
import org.onebusaway.nyc.siri.support.SiriExtensionWrapper;
import org.onebusaway.nyc.transit_data.services.NycTransitDataService;
import org.onebusaway.nyc.util.configuration.ConfigurationService;
import org.onebusaway.realtime.api.OccupancyStatus;
import org.onebusaway.realtime.api.TimepointPredictionRecord;
import org.onebusaway.realtime.api.VehicleOccupancyRecord;
import org.onebusaway.transit_data.model.StopBean;
import org.onebusaway.transit_data.model.blocks.BlockInstanceBean;
import org.onebusaway.transit_data.model.blocks.BlockStopTimeBean;
import org.onebusaway.transit_data.model.blocks.BlockTripBean;
import org.onebusaway.transit_data.model.service_alerts.ServiceAlertBean;
import org.onebusaway.transit_data.model.trips.TripBean;
import org.onebusaway.transit_data.model.trips.TripStatusBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.siri.siri.BlockRefStructure;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.DestinationRefStructure;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.FramedVehicleJourneyRefStructure;
import uk.org.siri.siri.JourneyPatternRefStructure;
import uk.org.siri.siri.JourneyPlaceRefStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.MonitoredCallStructure;
import uk.org.siri.siri.MonitoredVehicleJourneyStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.OnwardCallStructure;
import uk.org.siri.siri.OnwardCallsStructure;
import uk.org.siri.siri.OperatorRefStructure;
import uk.org.siri.siri.ProgressRateEnumeration;
import uk.org.siri.siri.SituationRefStructure;
import uk.org.siri.siri.SituationSimpleRefStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.siri.VehicleRefStructure;
import uk.org.siri.siri.OccupancyEnumeration;

public final class SiriSupport {

	private ConfigurationService _configurationService;

	public SiriSupport(ConfigurationService configurationService){
		_configurationService = configurationService;
	}

	public enum OnwardCallsMode {
		VEHICLE_MONITORING,
		STOP_MONITORING
	}
	
	//for the predictions data structure, given that layover predictions 
	//   requires a trip and stop id for matching
	private class SiriSupportPredictionTimepointRecord{
		private String _TripId = "";
		private String _StopId = "";
		private TimepointPredictionRecord _TimePointPredictionRecord;
		public void setTripId(String TripId){
			_TripId = TripId;
		}
		public void setStopId(String StopId){
			_StopId = StopId;
		}
		public void setTimepointPredictionRecord(TimepointPredictionRecord TimepointPredictionRecord){
			_TimePointPredictionRecord = TimepointPredictionRecord;
		}
		public String getKey(){
			return _TripId+_StopId;
		}
		public String getKey(String tripId, String stopId){
			_TripId = tripId;
			_StopId = stopId;
			return getKey();
		}
		public TimepointPredictionRecord getTimepointPredictionRecord(){
			return _TimePointPredictionRecord;
		}
	}

	/**
	 * NOTE: The tripDetails bean here may not be for the trip the vehicle is currently on 
	 * in the case of A-D for stop!
	 */
	public void fillMonitoredVehicleJourney(MonitoredVehicleJourneyStructure monitoredVehicleJourney, 
			TripBean framedJourneyTripBean, TripStatusBean currentVehicleTripStatus, StopBean monitoredCallStopBean, OnwardCallsMode onwardCallsMode,
			PresentationService presentationService, NycTransitDataService nycTransitDataService,
			int maximumOnwardCalls, long responseTimestamp) {

		BlockInstanceBean blockInstance = nycTransitDataService
				.getBlockInstance(currentVehicleTripStatus.getActiveTrip()
						.getBlockId(), currentVehicleTripStatus
						.getServiceDate());

		List<BlockTripBean> blockTrips = blockInstance.getBlockConfiguration().getTrips();

		if(monitoredCallStopBean == null) {
			monitoredCallStopBean = currentVehicleTripStatus.getNextStop();
		}
		
		
		List<TimepointPredictionRecord> currentTripPredictions = nycTransitDataService.getPredictionRecordsForVehicleAndTripStatus(currentVehicleTripStatus.getVehicleId(), currentVehicleTripStatus);
		List<TimepointPredictionRecord> nextTripPredictions = null;

		TripBean nextTripBean = null;
		if(_configurationService != null &&
				Boolean.parseBoolean(_configurationService.getConfigurationValueAsString(
						"display.showNextTripPredictions", "false"))) {
			nextTripBean = getNextTrip(currentVehicleTripStatus, nycTransitDataService);
			if (nextTripBean != null) {
				// TODO!  Next trip support!
				nextTripPredictions = nycTransitDataService.getPredictionRecordsForVehicleAndTrip(currentVehicleTripStatus.getVehicleId(), nextTripBean.getId());
			}
		}
		
		LineRefStructure lineRef = new LineRefStructure();
		lineRef.setValue(framedJourneyTripBean.getRoute().getId());
		monitoredVehicleJourney.setLineRef(lineRef);

		OperatorRefStructure operatorRef = new OperatorRefStructure();
		operatorRef.setValue(AgencySupportLibrary.getAgencyForId(framedJourneyTripBean.getRoute().getId()));
		monitoredVehicleJourney.setOperatorRef(operatorRef);

		DirectionRefStructure directionRef = new DirectionRefStructure();
		directionRef.setValue(framedJourneyTripBean.getDirectionId());
		monitoredVehicleJourney.setDirectionRef(directionRef);

		NaturalLanguageStringStructure routeShortName = new NaturalLanguageStringStructure();
		routeShortName.setValue(framedJourneyTripBean.getRoute().getShortName());
		monitoredVehicleJourney.setPublishedLineName(routeShortName);

		JourneyPatternRefStructure journeyPattern = new JourneyPatternRefStructure();
		journeyPattern.setValue(framedJourneyTripBean.getShapeId());
		monitoredVehicleJourney.setJourneyPatternRef(journeyPattern);

		NaturalLanguageStringStructure headsign = new NaturalLanguageStringStructure();
		headsign.setValue(framedJourneyTripBean.getTripHeadsign());
		monitoredVehicleJourney.setDestinationName(headsign);

		VehicleRefStructure vehicleRef = new VehicleRefStructure();
		vehicleRef.setValue(currentVehicleTripStatus.getVehicleId());
		monitoredVehicleJourney.setVehicleRef(vehicleRef);

		monitoredVehicleJourney.setMonitored(currentVehicleTripStatus.isPredicted());

		monitoredVehicleJourney.setBearing((float)currentVehicleTripStatus.getOrientation());

		monitoredVehicleJourney.setProgressRate(getProgressRateForPhaseAndStatus(
				currentVehicleTripStatus.getStatus(), currentVehicleTripStatus.getPhase()));

		fillOccupancy(monitoredVehicleJourney, nycTransitDataService, currentVehicleTripStatus);

		// origin-destination
		for(int i = 0; i < blockTrips.size(); i++) {
			BlockTripBean blockTrip = blockTrips.get(i);

			if(blockTrip.getTrip().getId().equals(framedJourneyTripBean.getId())) {
				List<BlockStopTimeBean> stops = blockTrip.getBlockStopTimes();
				
				JourneyPlaceRefStructure origin = new JourneyPlaceRefStructure();
				origin.setValue(stops.get(0).getStopTime().getStop().getId());
				monitoredVehicleJourney.setOriginRef(origin);
				
				StopBean lastStop = stops.get(stops.size() - 1).getStopTime().getStop();
				DestinationRefStructure dest = new DestinationRefStructure();
				dest.setValue(lastStop.getId());
				monitoredVehicleJourney.setDestinationRef(dest);
				
				break;
			}
		}

		// framed journey 
		FramedVehicleJourneyRefStructure framedJourney = new FramedVehicleJourneyRefStructure();
		DataFrameRefStructure dataFrame = new DataFrameRefStructure();
		dataFrame.setValue(String.format("%1$tY-%1$tm-%1$td", currentVehicleTripStatus.getServiceDate()));
		framedJourney.setDataFrameRef(dataFrame);
		framedJourney.setDatedVehicleJourneyRef(framedJourneyTripBean.getId());
		monitoredVehicleJourney.setFramedVehicleJourneyRef(framedJourney);

		// location
		// if vehicle is detected to be on detour, use actual lat/lon, not snapped location.
		LocationStructure location = new LocationStructure();

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(6);

		if (presentationService.isOnDetour(currentVehicleTripStatus)) {
			location.setLatitude(new BigDecimal(df.format(currentVehicleTripStatus.getLastKnownLocation().getLat())));
			location.setLongitude(new BigDecimal(df.format(currentVehicleTripStatus.getLastKnownLocation().getLon())));
		} else {
			location.setLatitude(new BigDecimal(df.format(currentVehicleTripStatus.getLocation().getLat())));
			location.setLongitude(new BigDecimal(df.format(currentVehicleTripStatus.getLocation().getLon())));
		}

		monitoredVehicleJourney.setVehicleLocation(location);

		// progress status
		List<String> progressStatuses = new ArrayList<String>();

		if (presentationService.isInLayover(currentVehicleTripStatus)) {
			progressStatuses.add("layover");
		}

		// "prevTrip" really means not on the framedvehiclejourney trip
		if(!framedJourneyTripBean.getId().equals(currentVehicleTripStatus.getActiveTrip().getId())) {
			progressStatuses.add("prevTrip");
		}

		if(!progressStatuses.isEmpty()) {
			NaturalLanguageStringStructure progressStatus = new NaturalLanguageStringStructure();
			progressStatus.setValue(StringUtils.join(progressStatuses, ","));
			monitoredVehicleJourney.setProgressStatus(progressStatus);    	
		}

		// block ref
		if (presentationService.isBlockLevelInference(currentVehicleTripStatus)) {
			BlockRefStructure blockRef = new BlockRefStructure();
			blockRef.setValue(framedJourneyTripBean.getBlockId());
			monitoredVehicleJourney.setBlockRef(blockRef);
		}

		// scheduled depature time
		if (presentationService.isBlockLevelInference(currentVehicleTripStatus) 
				&& (presentationService.isInLayover(currentVehicleTripStatus) 
				|| !framedJourneyTripBean.getId().equals(currentVehicleTripStatus.getActiveTrip().getId()))) {
			BlockStopTimeBean originDepartureStopTime = null;

			for(int t = 0; t < blockTrips.size(); t++) {
				BlockTripBean thisTrip = blockTrips.get(t);
				BlockTripBean nextTrip = null;    		
				if(t + 1 < blockTrips.size()) {
					nextTrip = blockTrips.get(t + 1);
				}

				if(thisTrip.getTrip().getId().equals(currentVehicleTripStatus.getActiveTrip().getId())) {    			
					// just started new trip
					if(currentVehicleTripStatus.getDistanceAlongTrip() < (0.5 * currentVehicleTripStatus.getTotalDistanceAlongTrip()) && !progressStatuses.contains("prevTrip")) {
						originDepartureStopTime = thisTrip.getBlockStopTimes().get(0);

					// at end of previous trip
					} else {
						if(nextTrip != null) {
							int blockStopTimesLastIndex = thisTrip.getBlockStopTimes().size() - 1;
							BlockStopTimeBean currentTripFinalStopTime = thisTrip.getBlockStopTimes().get(blockStopTimesLastIndex);

							int currentTripLastStopArrivalTime = currentTripFinalStopTime.getStopTime().getArrivalTime();
							int nextTripFirstStopDepartureTime = nextTrip.getBlockStopTimes().get(0).getStopTime().getDepartureTime();
							
							if(nextTripFirstStopDepartureTime - currentTripLastStopArrivalTime > 60){
								originDepartureStopTime = nextTrip.getBlockStopTimes().get(0);
							}
						}
					}

					break;
				}
			}

			if(originDepartureStopTime != null) {            	
				Date departureTime = new Date(currentVehicleTripStatus.getServiceDate() + (originDepartureStopTime.getStopTime().getDepartureTime() * 1000));
				monitoredVehicleJourney.setOriginAimedDepartureTime(departureTime);
			}
		}    
		
		Map<String, SiriSupportPredictionTimepointRecord> stopIdToPredictionRecordMap = new HashMap<String, SiriSupportPredictionTimepointRecord>();

		// (build map of stop IDs to TPRs)
		if(presentationService.useTimePredictionsIfAvailable()){
			if(currentTripPredictions != null) {
				for(TimepointPredictionRecord tpr : currentTripPredictions) {
					SiriSupportPredictionTimepointRecord r = new SiriSupportPredictionTimepointRecord();
					r.setStopId(tpr.getTimepointId().toString());
					r.setTripId(currentVehicleTripStatus.getActiveTrip().getId());
					r.setTimepointPredictionRecord(tpr);
					stopIdToPredictionRecordMap.put(r.getKey(), r);
				}
			}
			if(nextTripPredictions != null && nextTripBean != null){
				for(TimepointPredictionRecord tpr : nextTripPredictions) {
					SiriSupportPredictionTimepointRecord r = new SiriSupportPredictionTimepointRecord();
					r.setStopId(tpr.getTimepointId().toString());
					r.setTripId(nextTripBean.getId());
					r.setTimepointPredictionRecord(tpr);
					stopIdToPredictionRecordMap.put(r.getKey(), r);
				}
			}
		}
		
		// monitored call
		if(!presentationService.isOnDetour(currentVehicleTripStatus)) {
			fillMonitoredCall(monitoredVehicleJourney, blockInstance, currentVehicleTripStatus, monitoredCallStopBean,
					presentationService, nycTransitDataService, stopIdToPredictionRecordMap, responseTimestamp);
		}

		// onward calls
		if(!presentationService.isOnDetour(currentVehicleTripStatus))
			fillOnwardCalls(monitoredVehicleJourney, blockInstance, framedJourneyTripBean, currentVehicleTripStatus, onwardCallsMode,
				presentationService, nycTransitDataService, stopIdToPredictionRecordMap, maximumOnwardCalls, responseTimestamp);

		// situations
		fillSituations(monitoredVehicleJourney, currentVehicleTripStatus);
		
		if(monitoredVehicleJourney.getOccupancy() != null){
		  System.out.println("Has OCCUPANCY: " + monitoredVehicleJourney.getVehicleRef().getValue());
		}
		
		return;
	}
	
	 private TripBean getNextTrip(TripStatusBean currentVehicleTripStatus, NycTransitDataService nycTransitDataService){
		  BlockInstanceBean blockInstance = 
				  nycTransitDataService.getBlockInstance(currentVehicleTripStatus.getActiveTrip().getBlockId(), currentVehicleTripStatus.getServiceDate());

		List<BlockTripBean> blockTrips = blockInstance.getBlockConfiguration().getTrips();
		TripBean nextTripBean = null;
		for(int i=0; i<blockTrips.size(); i++){
			//does this block trip match the active trip currently in progress, if so, lets get the next trip if it exists
			if(blockTrips.get(i).getTrip().getId().equals(currentVehicleTripStatus.getActiveTrip().getId())){
				if(i+1 < blockTrips.size()){
					if(blockTrips.get(i+1) != null){
						nextTripBean = blockTrips.get(i+1).getTrip();
						break;
					}
				}
			}
		 }
	    return nextTripBean;
	  }

	/***
	 * PRIVATE NoLongerStatic METHODS
	 */
	private void fillOnwardCalls(MonitoredVehicleJourneyStructure monitoredVehicleJourney, 
			BlockInstanceBean blockInstance, TripBean framedJourneyTripBean, TripStatusBean currentVehicleTripStatus, OnwardCallsMode onwardCallsMode,
			PresentationService presentationService, NycTransitDataService nycTransitDataService, 
			Map<String, SiriSupportPredictionTimepointRecord> stopLevelPredictions, int maximumOnwardCalls, long responseTimestamp) {

		String tripIdOfMonitoredCall = framedJourneyTripBean.getId();

		monitoredVehicleJourney.setOnwardCalls(new OnwardCallsStructure());

		//////////

		// no need to go further if this is the case!
		if(maximumOnwardCalls == 0) { 
			return;
		}

		List<BlockTripBean> blockTrips = blockInstance.getBlockConfiguration().getTrips();

		double distanceOfVehicleAlongBlock = 0;
		int blockTripStopsAfterTheVehicle = 0; 
		int onwardCallsAdded = 0;

		boolean foundActiveTrip = false;
		for(int i = 0; i < blockTrips.size(); i++) {
			BlockTripBean blockTrip = blockTrips.get(i);

			if(!foundActiveTrip) {
				if(currentVehicleTripStatus.getActiveTrip().getId().equals(blockTrip.getTrip().getId())) {
					distanceOfVehicleAlongBlock += currentVehicleTripStatus.getDistanceAlongTrip();
					foundActiveTrip = true;
				} else {
					// a block trip's distance along block is the *beginning* of that block trip along the block
					// so to get the size of this one, we have to look at the next.
					if(i + 1 < blockTrips.size()) {
						distanceOfVehicleAlongBlock = blockTrips.get(i + 1).getDistanceAlongBlock();
					}

					// bus has already served this trip, so no need to go further
					continue;
				}
			}

			if(onwardCallsMode == OnwardCallsMode.STOP_MONITORING) {
				// always include onward calls for the trip the monitored call is on ONLY.
				if(!blockTrip.getTrip().getId().equals(tripIdOfMonitoredCall)) {
					continue;
				}
			}

			for(BlockStopTimeBean stopTime : blockTrip.getBlockStopTimes()) {
				// check for non-revenue stops for onward calls
				if(currentVehicleTripStatus.getActiveTrip().getRoute() != null) {
					String agencyId = currentVehicleTripStatus.getActiveTrip().getRoute().getAgency().getId();
					String routeId = currentVehicleTripStatus.getActiveTrip().getRoute().getId();
					String directionId = currentVehicleTripStatus.getActiveTrip().getDirectionId();
					String stopId  = stopTime.getStopTime().getStop().getId();
					if (!nycTransitDataService.stopHasRevenueServiceOnRoute(agencyId, stopId, routeId, directionId)){
						continue;
					}
				}

				// block trip stops away--on this trip, only after we've passed the stop, 
				// on future trips, count always.
				if(currentVehicleTripStatus.getActiveTrip().getId().equals(blockTrip.getTrip().getId())) {
					if(stopTime.getDistanceAlongBlock() >= distanceOfVehicleAlongBlock) {
						blockTripStopsAfterTheVehicle++;
					} else {
						// stop is behind the bus--no need to go further
						continue;
					}

				// future trip--bus hasn't reached this trip yet, so count all stops
				} else {
					blockTripStopsAfterTheVehicle++;
				}
				
				SiriSupportPredictionTimepointRecord ssptr = new SiriSupportPredictionTimepointRecord();
				String stopPredictionKey = ssptr.getKey(blockTrip.getTrip().getId(), stopTime.getStopTime().getStop().getId());
				monitoredVehicleJourney.getOnwardCalls().getOnwardCall().add(
						getOnwardCallStructure(stopTime.getStopTime().getStop(), presentationService, 
								stopTime.getDistanceAlongBlock() - blockTrip.getDistanceAlongBlock(), 
								stopTime.getDistanceAlongBlock() - distanceOfVehicleAlongBlock, 
								blockTripStopsAfterTheVehicle - 1,
								stopLevelPredictions.get(stopPredictionKey), responseTimestamp, stopTime.getStopTime().getArrivalTime()));

				onwardCallsAdded++;

				if(onwardCallsAdded >= maximumOnwardCalls) {
					return;
				}
			}

			// if we get here, we added our stops
			return;
		}

		return;
	}

	private void fillMonitoredCall(MonitoredVehicleJourneyStructure monitoredVehicleJourney, 
			BlockInstanceBean blockInstance, TripStatusBean tripStatus, StopBean monitoredCallStopBean, 
			PresentationService presentationService, NycTransitDataService nycTransitDataService,
			Map<String, SiriSupportPredictionTimepointRecord> stopLevelPredictions, long responseTimestamp) {

		List<BlockTripBean> blockTrips = blockInstance.getBlockConfiguration().getTrips();

		double distanceOfVehicleAlongBlock = 0;
		int blockTripStopsAfterTheVehicle = 0; 

		boolean foundActiveTrip = false;
		for(int i = 0; i < blockTrips.size(); i++) {
			BlockTripBean blockTrip = blockTrips.get(i);

			if(!foundActiveTrip) {
				if(tripStatus.getActiveTrip().getId().equals(blockTrip.getTrip().getId())) {
					distanceOfVehicleAlongBlock += tripStatus.getDistanceAlongTrip();

					foundActiveTrip = true;
				} else {
					// a block trip's distance along block is the *beginning* of that block trip along the block
					// so to get the size of this one, we have to look at the next.
					if(i + 1 < blockTrips.size()) {
						distanceOfVehicleAlongBlock = blockTrips.get(i + 1).getDistanceAlongBlock();
					}

					// bus has already served this trip, so no need to go further
					continue;
				}
			}

			HashMap<String, Integer> visitNumberForStopMap = new HashMap<String, Integer>();	   

			for(BlockStopTimeBean stopTime : blockTrip.getBlockStopTimes()) {
				int visitNumber = getVisitNumber(visitNumberForStopMap, stopTime.getStopTime().getStop());

				// block trip stops away--on this trip, only after we've passed the stop, 
				// on future trips, count always.
				if(tripStatus.getActiveTrip().getId().equals(blockTrip.getTrip().getId())) {
					if(stopTime.getDistanceAlongBlock() >= distanceOfVehicleAlongBlock) {
						blockTripStopsAfterTheVehicle++;
					} else {
						// bus has passed this stop already--no need to go further
						continue;
					}

				// future trip--bus hasn't reached this trip yet, so count all stops
				} else {
					blockTripStopsAfterTheVehicle++;
				}

				// monitored call
				if(stopTime.getStopTime().getStop().getId().equals(monitoredCallStopBean.getId())) {    
					if(!presentationService.isOnDetour(tripStatus)) {
						SiriSupportPredictionTimepointRecord ssptr = new SiriSupportPredictionTimepointRecord();
						String stopPredictionKey = ssptr.getKey(blockTrip.getTrip().getId(), stopTime.getStopTime().getStop().getId());
						monitoredVehicleJourney.setMonitoredCall(
								getMonitoredCallStructure(stopTime.getStopTime().getStop(), presentationService, 
										stopTime.getDistanceAlongBlock() - blockTrip.getDistanceAlongBlock(), 
										stopTime.getDistanceAlongBlock() - distanceOfVehicleAlongBlock, 
										visitNumber, blockTripStopsAfterTheVehicle - 1,
										stopLevelPredictions.get(stopPredictionKey),
										responseTimestamp, stopTime.getStopTime().getArrivalTime()));

					}

					// we found our monitored call--stop
					return;
				}
			}    	
		}
	}

	private static void fillOccupancy(MonitoredVehicleJourneyStructure mvj, NycTransitDataService tds, TripStatusBean tripStatus) {
	  if (tripStatus == null
        || tripStatus.getActiveTrip() == null
        || tripStatus.getActiveTrip().getRoute() ==  null) {
      return;
    }
    VehicleOccupancyRecord vor =
        tds.getVehicleOccupancyRecordForVehicleIdAndRoute(
            AgencyAndId.convertFromString(tripStatus.getVehicleId()),
            tripStatus.getActiveTrip().getRoute().getId(),
            tripStatus.getActiveTrip().getDirectionId());
    mvj.setOccupancy(mapOccupancyStatusToEnumeration(vor));
	}
	
	private static OccupancyEnumeration mapOccupancyStatusToEnumeration(VehicleOccupancyRecord vor) {
    if (vor == null) return null;
    switch (vor.getOccupancyStatus()) {
      case UNKNOWN:
        return null;
      case EMPTY:
      case MANY_SEATS_AVAILABLE:
      case FEW_SEATS_AVAILABLE:
        return OccupancyEnumeration.SEATS_AVAILABLE;
      case STANDING_ROOM_ONLY:
        return OccupancyEnumeration.STANDING_AVAILABLE;
      case FULL:
      case CRUSHED_STANDING_ROOM_ONLY:
      case NOT_ACCEPTING_PASSENGERS:
        return OccupancyEnumeration.FULL;
      default:
        return null;
    }
  }

	private static OccupancyEnumeration mapOccupancyStatusToEnumeration(Integer occupancyStatusInteger) {

		if (occupancyStatusInteger == null) {
			return null;
		}

		OccupancyStatus occupancyStatus = OccupancyStatus.toEnum(occupancyStatusInteger);

		switch (occupancyStatus) {
			case UNKNOWN:
				return null;
			case EMPTY:
			case MANY_SEATS_AVAILABLE:
			case FEW_SEATS_AVAILABLE:
				return OccupancyEnumeration.SEATS_AVAILABLE;
			case STANDING_ROOM_ONLY:
				return OccupancyEnumeration.STANDING_AVAILABLE;
			case FULL:
			case CRUSHED_STANDING_ROOM_ONLY:
			case NOT_ACCEPTING_PASSENGERS:
				return OccupancyEnumeration.FULL;
			default:
				return null;
		}
	}


	private void fillSituations(MonitoredVehicleJourneyStructure monitoredVehicleJourney, TripStatusBean tripStatus) {
		if (tripStatus == null || tripStatus.getSituations() == null || tripStatus.getSituations().isEmpty()) {
			return;
		}

		List<SituationRefStructure> situationRef = monitoredVehicleJourney.getSituationRef();

		for (ServiceAlertBean situation : tripStatus.getSituations()) {
			SituationRefStructure sitRef = new SituationRefStructure();
			SituationSimpleRefStructure sitSimpleRef = new SituationSimpleRefStructure();
			sitSimpleRef.setValue(situation.getId());
			sitRef.setSituationSimpleRef(sitSimpleRef);
			situationRef.add(sitRef);
		}
	}

	private static OnwardCallStructure getOnwardCallStructure(StopBean stopBean,
															  PresentationService presentationService,
															  double distanceOfCallAlongTrip, double distanceOfVehicleFromCall, int index,
															  SiriSupportPredictionTimepointRecord prediction, long responseTimestamp, int arrivalTime) {

		OnwardCallStructure onwardCallStructure = new OnwardCallStructure();

		StopPointRefStructure stopPointRef = new StopPointRefStructure();
		stopPointRef.setValue(stopBean.getId());
		onwardCallStructure.setStopPointRef(stopPointRef);

		NaturalLanguageStringStructure stopPoint = new NaturalLanguageStringStructure();
		stopPoint.setValue(stopBean.getName());
		onwardCallStructure.setStopPointName(stopPoint);
		
		boolean isNearFirstStop = false;
		if (distanceOfCallAlongTrip < 100) isNearFirstStop = true;

		if(prediction != null) {
			if (prediction.getTimepointPredictionRecord().getTimepointPredictedTime() < responseTimestamp) {
				if (!isNearFirstStop) { onwardCallStructure.setExpectedArrivalTime(new Date(responseTimestamp));}
				else {
				onwardCallStructure.setExpectedDepartureTime(new Date(responseTimestamp));
				}
			} else {
				if (!isNearFirstStop) {	onwardCallStructure.setExpectedArrivalTime(new Date(prediction.getTimepointPredictionRecord().getTimepointPredictedTime()));}
				else {
				onwardCallStructure.setExpectedDepartureTime(new Date(prediction.getTimepointPredictionRecord().getTimepointPredictedTime()));
				}
			}
		}

		Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		calendar.set(year, month, day, 0, 0, 0);
		calendar.add(Calendar.SECOND, arrivalTime);
		onwardCallStructure.setAimedArrivalTime(calendar.getTime());

		// siri extensions
		SiriExtensionWrapper wrapper = new SiriExtensionWrapper();
		ExtensionsStructure distancesExtensions = new ExtensionsStructure();
		SiriDistanceExtension distances = new SiriDistanceExtension();

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setGroupingUsed(false);

		distances.setStopsFromCall(index);
		distances.setCallDistanceAlongRoute(Double.valueOf(df.format(distanceOfCallAlongTrip)));
		distances.setDistanceFromCall(Double.valueOf(df.format(distanceOfVehicleFromCall)));
		distances.setPresentableDistance(presentationService.getPresentableDistance(distances));

		wrapper.setDistances(distances);
		distancesExtensions.setAny(wrapper);    
		onwardCallStructure.setExtensions(distancesExtensions);

		return onwardCallStructure;
	}

	private MonitoredCallStructure getMonitoredCallStructure(StopBean stopBean,
															 PresentationService presentationService,
															 double distanceOfCallAlongTrip, double distanceOfVehicleFromCall, int visitNumber, int index,
															 SiriSupportPredictionTimepointRecord prediction, long responseTimestamp, int arrivalTime) {

		MonitoredCallStructure monitoredCallStructure = new MonitoredCallStructure();
		monitoredCallStructure.setVisitNumber(BigInteger.valueOf(visitNumber));

		StopPointRefStructure stopPointRef = new StopPointRefStructure();
		stopPointRef.setValue(stopBean.getId());
		monitoredCallStructure.setStopPointRef(stopPointRef);

		NaturalLanguageStringStructure stopPoint = new NaturalLanguageStringStructure();
		stopPoint.setValue(stopBean.getName());
		monitoredCallStructure.setStopPointName(stopPoint);

		if(prediction != null) {
			// do not allow predicted times to be less than ResponseTimestamp
			if (prediction.getTimepointPredictionRecord().getTimepointPredictedTime() < responseTimestamp) {
				/*
				 * monitoredCall has less precision than onwardCall (date vs. timestamp)
				 * which results in a small amount of error when converting back to timestamp.
				 * Add a second here to prevent negative values from showing up in the UI 
				 * (actual precision of the value is 1 minute, so a second has little influence)
				 */
				monitoredCallStructure.setExpectedArrivalTime(new Date(responseTimestamp + 1000)); 
				monitoredCallStructure.setExpectedDepartureTime(new Date(responseTimestamp + 1000));
			} else {
				monitoredCallStructure.setExpectedArrivalTime(new Date(prediction.getTimepointPredictionRecord().getTimepointPredictedTime()));
				monitoredCallStructure.setExpectedDepartureTime(new Date(prediction.getTimepointPredictionRecord().getTimepointPredictedTime()));
			}
			
		}

		Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		calendar.set(year, month, day, 0, 0, 0);
		calendar.add(Calendar.SECOND, arrivalTime);
		monitoredCallStructure.setAimedArrivalTime(calendar.getTime());
		
		// siri extensions
		SiriExtensionWrapper wrapper = new SiriExtensionWrapper();
		ExtensionsStructure distancesExtensions = new ExtensionsStructure();
		SiriDistanceExtension distances = new SiriDistanceExtension();

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setGroupingUsed(false);

		distances.setStopsFromCall(index);
		distances.setCallDistanceAlongRoute(Double.valueOf(df.format(distanceOfCallAlongTrip)));
		distances.setDistanceFromCall(Double.valueOf(df.format(distanceOfVehicleFromCall)));
		distances.setPresentableDistance(presentationService.getPresentableDistance(distances));

		wrapper.setDistances(distances);
		distancesExtensions.setAny(wrapper);
		monitoredCallStructure.setExtensions(distancesExtensions);

		return monitoredCallStructure;
	}

	private int getVisitNumber(HashMap<String, Integer> visitNumberForStop, StopBean stop) {
		int visitNumber;

		if (visitNumberForStop.containsKey(stop.getId())) {
			visitNumber = visitNumberForStop.get(stop.getId()) + 1;
		} else {
			visitNumber = 1;
		}

		visitNumberForStop.put(stop.getId(), visitNumber);

		return visitNumber;
	}

	private ProgressRateEnumeration getProgressRateForPhaseAndStatus(String status, String phase) {
		if (phase == null) {
			return ProgressRateEnumeration.UNKNOWN;
		}

		if (phase.toLowerCase().startsWith("layover")
				|| phase.toLowerCase().startsWith("deadhead")
				|| phase.toLowerCase().equals("at_base")) {
			return ProgressRateEnumeration.NO_PROGRESS;
		}

		if (status != null && status.toLowerCase().equals("stalled")) {
			return ProgressRateEnumeration.NO_PROGRESS;
		}

		if (phase.toLowerCase().equals("in_progress")) {
			return ProgressRateEnumeration.NORMAL_PROGRESS;
		}

		return ProgressRateEnumeration.UNKNOWN;
	}

}
