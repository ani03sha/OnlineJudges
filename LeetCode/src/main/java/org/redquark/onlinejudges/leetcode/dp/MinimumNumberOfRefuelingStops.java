package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MinimumNumberOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        // Total fuel stations
        int n = stations.length;
        // Lookup table to store the farthest distance
        // that can be travelled after refuleling i.e.,
        // dp[i] => farthest distance that can be travelled
        // after refueling i times
        long[] lookup = new long[n + 1];
        // Base initialization
        lookup[0] = startFuel;
        // Traverse for all stations
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                // If we are able to reach to the station
                if (lookup[j] >= stations[i][0]) {
                    lookup[j + 1] = Math.max(lookup[j + 1], lookup[j] + stations[i][1]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (lookup[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
