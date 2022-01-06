package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        // Array to store the number of passengers at each stop.
        // i.e., stops[i] => number of passengers at i-th stop.
        int[] stops = new int[1001];
        // Loop through every trip
        for (int[] trip : trips) {
            // Since trip[1] represents the number of passengers entering
            // the vehicle, we will add that to the stops[trip[1]]
            stops[trip[1]] += trip[0];
            // Since trip[2] represents the number of passengers leaving
            // the vehicle, we will subtract that from the stops[trip[2]]
            stops[trip[2]] -= trip[0];
        }
        // Sum of passengers present in the vehicle at every stop
        int totalPassengers = 0;
        // Loop through every stop
        for (int stop : stops) {
            totalPassengers += stop;
            // If the total passengers is greater than the capacity, we
            // will return false
            if (totalPassengers > capacity) {
                return false;
            }
        }
        return true;
    }
}
