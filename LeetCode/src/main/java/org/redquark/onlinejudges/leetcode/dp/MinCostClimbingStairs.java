package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        // Special case
        if (cost == null || cost.length == 0) {
            return 0;
        }
        // Total number of stairs
        int n = cost.length;
        // Lookup table to store minimum cost for reaching
        // a certain stair
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = cost[0];
        lookup[1] = cost[1];
        // Calculate cost for remaining stairs
        for (int i = 2; i <= n; i++) {
            lookup[i] = Math.min(lookup[i - 1], lookup[i - 2]) + (i == n ? 0 : cost[i]);
        }
        return lookup[n];
    }
}
