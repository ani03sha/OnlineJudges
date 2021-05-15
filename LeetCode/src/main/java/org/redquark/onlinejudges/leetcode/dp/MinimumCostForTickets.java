package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MinimumCostForTickets {

    public int minCostTickets(int[] days, int[] costs) {
        // Special case
        if (days == null || days.length == 0 || costs == null || costs.length == 0) {
            return 0;
        }
        // Total number of days
        int n = days.length;
        // Boolean array to denote if a day is a travel day or not
        boolean[] travelDays = new boolean[days[n - 1] + 1];
        for (int day : days) {
            travelDays[day] = true;
        }
        // Lookup table to store the minimum cost of travel
        // on a certain day
        int[] lookup = new int[31];
        // Check for every day
        for (int i = days[0]; i <= days[n - 1]; i++) {
            if (!travelDays[i]) {
                lookup[i % 31] = lookup[(i - 1) % 31];
            } else {
                lookup[i % 31] = Math.min(lookup[Math.max(0, (i - 1) % 31)] + costs[0],
                        Math.min(lookup[Math.max(0, (i - 7) % 31)] + costs[1],
                                lookup[Math.max(0, i - 30) % 31] + costs[2]));
            }
        }
        return lookup[days[n - 1] % 31];
    }
}
