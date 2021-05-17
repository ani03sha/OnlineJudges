package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Lookup table to store minimum steps to reach
        // a certain stair i.e., lookup[i] => minimum steps
        // to reach i-th stair
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = 1;
        for (int i = 2; i <= n; i++) {
            lookup[i] += lookup[i - 1] + lookup[i - 2];
        }
        return lookup[n];
    }
}
