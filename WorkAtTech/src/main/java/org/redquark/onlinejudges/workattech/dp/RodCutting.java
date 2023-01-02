package org.redquark.onlinejudges.workattech.dp;

public class RodCutting {

    public int maximumProfit(int n, int[] prices) {
        // Special case
        if (n == 0) {
            return 0;
        }
        // Lookup table to store the maximum profit
        // for lengths from 0 to n.
        int[] lookup = new int[n + 1];
        // Loop through the array
        for (int i = 1; i <= n; i++) {
            // If one piece is of length i then
            // the other piece would be of length
            // n - i.
            for (int j = 1; j <= i; j++) {
                lookup[i] = Math.max(lookup[i], prices[j - 1] + lookup[i - j]);
            }
        }
        return lookup[n];
    }
}
