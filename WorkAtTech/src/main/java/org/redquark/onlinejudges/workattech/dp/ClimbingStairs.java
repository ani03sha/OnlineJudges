package org.redquark.onlinejudges.workattech.dp;

public class ClimbingStairs {

    public int climbStairs(int n) {
        // Special case
        if (n < 3) {
            return n;
        }
        // Lookup table to store the number of
        // ways to climb n stairs
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[1] = 1;
        lookup[2] = 2;
        // Populate for remaining stairs
        for (int i = 3; i <= n; i++) {
            lookup[i] = lookup[i - 1] + lookup[i - 2];
        }
        return lookup[n];
    }
}
