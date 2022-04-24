package org.redquark.onlinejudges.leetcode.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class DesignUndergroundSystem {

    static class UndergroundSystem {
        // Map to store the check in data [id, stationName | time]]
        private final Map<Integer, String> checkIns;
        // Map to store the route and total time taken and count [route, totalTime | count]
        private final Map<String, String> checkOuts;

        public UndergroundSystem() {
            this.checkIns = new HashMap<>();
            this.checkOuts = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            // Add the check-in to the map
            checkIns.put(id, stationName + "|" + t);
        }

        public void checkOut(int id, String stationName, int t) {
            // First we will have to calculate the route, which will be from
            // check in station to the checkout station
            // The route will become
            String[] checkInData = checkIns.get(id).split("\\|");
            String checkInStation = checkInData[0];
            int checkInTime = Integer.parseInt(checkInData[1]);
            // The route will become
            String route = checkInStation + "=>" + stationName;
            // Time taken
            int timeTaken = t - checkInTime;
            // Get the entry corresponding to the route, if there is any
            String checkOutData = checkOuts.get(route);
            if (checkOutData == null) {
                checkOuts.put(route, timeTaken + "|" + 1);
            } else {
                String[] checkOutDataArray = checkOutData.split("\\|");
                int totalTime = timeTaken + Integer.parseInt(checkOutDataArray[0]);
                int count = 1 + Integer.parseInt(checkOutDataArray[1]);
                checkOuts.put(route, totalTime + "|" + count);
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            // Calculate the route from start station to end station
            String route = startStation + "=>" + endStation;
            String[] checkOutData = checkOuts.get(route).split("\\|");
            int totalTime = Integer.parseInt(checkOutData[0]);
            int count = Integer.parseInt(checkOutData[1]);
            return totalTime * 1.0 / count;
        }
    }
}
