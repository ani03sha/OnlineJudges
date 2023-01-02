package org.redquark.onlinejudges.workattech.greedy;

import java.util.Arrays;

public class TrainsAndPlatforms {

    public int minPlatforms(Train[] trains) {
        // Special case
        if (trains == null || trains.length == 0) {
            return 0;
        }
        // Total number of trains
        int n = trains.length;
        // Arrays to store the arrivals and departures
        int[] arrivals = new int[n];
        int[] departures = new int[n];
        for (int i = 0; i < n; i++) {
            arrivals[i] = trains[i].arrival;
            departures[i] = trains[i].departure;
        }
        // Sort both arrays
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        // Total number of platforms required
        int platforms = 0;
        // Total trains at the station
        int trainsAtTheStation = 0;
        // Process every train
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (arrivals[i] <= departures[j]) {
                trainsAtTheStation++;
                i++;
                platforms = Math.max(platforms, trainsAtTheStation);
            } else {
                trainsAtTheStation--;
                j++;
            }
        }
        return platforms;
    }

    static class Train {
        public int arrival, departure;

        public Train(int arrival, int departure) {
            this.arrival = arrival;
            this.departure = departure;
        }
    }
}
