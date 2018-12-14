/**
 * Copyright (C) 2017 Cambridge Systematics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.nyc.gtfsrt.tests;

import com.google.transit.realtime.GtfsRealtime.*;
import org.junit.Test;
import org.onebusaway.collections.MappingLibrary;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.gtfs.model.StopTime;
import org.onebusaway.nyc.gtfsrt.impl.TripUpdateFeedBuilderImpl;
import org.onebusaway.nyc.gtfsrt.service.TripUpdateFeedBuilder;
import org.onebusaway.nyc.gtfsrt.tds.MockConfigurationService;
import org.onebusaway.nyc.gtfsrt.tds.MockTransitDataService;
import org.onebusaway.nyc.gtfsrt.util.InferredLocationReader;
import org.onebusaway.nyc.transit_data_federation.impl.predictions.QueuePredictionIntegrationServiceImpl;
import org.onebusaway.realtime.api.TimepointPredictionRecord;
import org.onebusaway.transit_data.model.VehicleStatusBean;
import org.onebusaway.transit_data.model.realtime.VehicleLocationRecordBean;
import org.onebusaway.transit_data.model.trips.TripBean;
import org.onebusaway.transit_data.services.TransitDataService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.onebusaway.nyc.gtfsrt.tests.GtfsRtAssertLibrary.*;

/**
 * Test that OBA models match a TripUpdate. Should be subclassed to test a particular instance.
 */
public abstract class TripUpdateTest {

    private static final double TOLERANCE = 0.00001;

    private String _inferenceFile, _pbFile;

    private TripUpdateFeedBuilder _feedBuilder;

    private TransitDataService _transitDataService;

    private QueuePredictionIntegrationServiceImpl _predictionIntegrationService;

    public TripUpdateTest(String gtfsFile, String defaultAgencyId, String blockTripMapFile, String inferenceFile, String pbFile) {
        MockTransitDataService tds = new MockTransitDataService(defaultAgencyId, gtfsFile, blockTripMapFile);
        _transitDataService = tds;

        _inferenceFile = inferenceFile;
        _pbFile = pbFile;

        TripUpdateFeedBuilderImpl feedBuilder = new TripUpdateFeedBuilderImpl();
        _feedBuilder = feedBuilder;

        _predictionIntegrationService = new QueuePredictionIntegrationServiceImpl();
        _predictionIntegrationService.setTransitDataService(_transitDataService);
        _predictionIntegrationService.setConfigurationService(new MockConfigurationService());
    }

    @Test
    public void test() throws IOException {
        List<VehicleLocationRecordBean> vlrbs = new InferredLocationReader().getRecords(_inferenceFile);
        assertFalse(vlrbs.isEmpty());
        VehicleLocationRecordBean vlrb = vlrbs.get(vlrbs.size() - 1);
        _transitDataService.submitVehicleLocation(vlrb);

        VehicleStatusBean status = _transitDataService.getVehicleForAgency(vlrb.getVehicleId(), vlrb.getTimeOfRecord());

        FeedMessage msg = FeedMessage.parseFrom(this.getClass().getResourceAsStream("/" + _pbFile));

        String vehicleId = status.getVehicleId();

        _predictionIntegrationService.setTime(vlrb.getTimeOfRecord());
        _predictionIntegrationService.processResult(msg);

        List<String> tripIds = getTripIds(msg);

        assertEquals(getExpectedNumberOfTrips(), tripIds.size());

        for (String tripId : tripIds) {

            List<TimepointPredictionRecord> records = _predictionIntegrationService.getPredictionRecordsForVehicleAndTrip(vehicleId, tripId);
            assertFalse(records.isEmpty());

            TripBean trip = _transitDataService.getTrip(tripId);

            TripUpdate.Builder tripUpdate = _feedBuilder.makeTripUpdate(trip, status, records);
            assertTripDescriptorMatches(trip, tripUpdate.getTrip());
            assertDelayMatches(status, tripUpdate.getDelay());
            assertVehicleDescriptorMatches(vlrb, tripUpdate.getVehicle());
            assertIncreasingStopTimeUpdates(tripUpdate.getStopTimeUpdateList());
            assertStopTimeUpdatesMatchTprs(records, tripUpdate.getStopTimeUpdateList());
            assertStopTimeUpdatesMatchTrip(trip, tripUpdate.getStopTimeUpdateList());

            assertReasonableTimestamp(tripUpdate);
        }
    }

    int getExpectedNumberOfTrips() {
        return 1;
    }

    private void assertDelayMatches(VehicleStatusBean status, int delay) {
        assertEquals(status.getTripStatus().getScheduleDeviation(), delay, TOLERANCE);
    }

    protected void assertStopTimeUpdatesMatchTprs(List<TimepointPredictionRecord> records, List<TripUpdate.StopTimeUpdate> stus) {
        assertEquals(records.size(), stus.size());
        Map<AgencyAndId, TimepointPredictionRecord> tprByStop = MappingLibrary.mapToValue(records, "timepointId.id");
        for (TripUpdate.StopTimeUpdate stu : stus) {
            TimepointPredictionRecord tpr = tprByStop.get(stu.getStopId());
            assertNotNull(tpr);
            assertEquals(tpr.getTimepointId().getId(), stu.getStopId());
            assertEquals(tpr.getStopSequence(), stu.getStopSequence());
            long time = tpr.getTimepointPredictedTime()/1000;
            assertTrue(stu.hasArrival() || stu.hasDeparture());
            if (stu.hasArrival())
                assertEquals(time, stu.getArrival().getTime());
            if (stu.hasDeparture())
                assertEquals(time, stu.getDeparture().getTime());
            // TODO - will arrival or departure be different at some point?
        }
    }

    private void assertStopTimeUpdatesMatchTrip(TripBean trip, List<TripUpdate.StopTimeUpdate> stus) {
        List<StopTime> stopTimes = findStopTimeSubsequence(trip, stus);
        assertNotNull(stopTimes);
        for (int i = 0; i < stopTimes.size(); i++) {
            StopTime st = stopTimes.get(i);
            TripUpdate.StopTimeUpdate stu = stus.get(i);
            assertEquals(st.getStopSequence(), stu.getStopSequence());
            assertEquals(st.getStop().getId().getId(), stu.getStopId());
        }
    }

    // will not work for loops
    private List<StopTime> findStopTimeSubsequence(TripBean trip, List<TripUpdate.StopTimeUpdate> stus) {
        List<StopTime> allStopTimes = ((MockTransitDataService) _transitDataService).getStopTimesForTrip(trip);
        Iterator<StopTime> iter = allStopTimes.iterator();
        StopTime st = iter.next();
        while (iter.hasNext()) {
            List<StopTime> ret = new ArrayList<StopTime>();
            int i = 0;
            while (!st.getStop().getId().getId().equals(stus.get(i).getStopId()) && iter.hasNext())
                st = iter.next();
            while (st != null && i < stus.size() && st.getStop().getId().getId().equals(stus.get(i).getStopId())) {
                ret.add(st);
                st = iter.hasNext() ? iter.next() : null;
                i++;
            }
            if (i == stus.size())
                return ret;
        }
        return null;
    }

    private void assertReasonableTimestamp(TripUpdateOrBuilder tu) {
        long minStu = Long.MAX_VALUE;
        for (TripUpdate.StopTimeUpdate stu : tu.getStopTimeUpdateList()) {
            long time = stu.hasArrival() ? stu.getArrival().getTime() : stu.getDeparture().getTime();
            minStu = Math.min(minStu, time);
        }
        long timestamp = tu.getTimestamp();
        assertTrue(timestamp <= minStu);
        assertTrue(minStu - timestamp < 3600);
    }

    private List<String> getTripIds(FeedMessage message) {
        List<String> tripIds = new ArrayList<String>();
        for (FeedEntity entity : message.getEntityList()) {
            if (entity.hasTripUpdate()) {
                String tripId = entity.getTripUpdate().getTrip().getTripId();
                tripIds.add(tripId);
            }
        }
        return tripIds;
    }

    private void assertIncreasingStopTimeUpdates(List<TripUpdate.StopTimeUpdate> updates) {
        long time = 0;
        int sequence = -1;
        for (TripUpdate.StopTimeUpdate update : updates) {
            assertTrue(time < update.getDeparture().getTime());
            assertTrue(sequence < update.getStopSequence());
            time = update.getDeparture().getTime();
            sequence = update.getStopSequence();
        }
    }
}
