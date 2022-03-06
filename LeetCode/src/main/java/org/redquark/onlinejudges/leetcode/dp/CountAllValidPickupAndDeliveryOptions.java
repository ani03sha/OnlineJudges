package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class CountAllValidPickupAndDeliveryOptions {

    public int countOrders(int n) {
        // Special case
        if (n < 2) {
            return n;
        }
        final int MODULO = (int) 1e9 + 7;
        // Lookup table to store the count of options
        // for i orders
        long[] lookup = new long[n + 1];
        // Base initialization
        lookup[1] = 1;
        // Populate the table for remaining places
        for (int i = 2; i <= n; i++) {
            // Valid places to place pickup and
            // delivery of current order
            int places = 2 * i - 1;
            // Total combinations
            int combinations = places * (places + 1) / 2;
            // Total combinations for current value
            lookup[i] = (lookup[i - 1] * combinations) % MODULO;
        }
        return (int) lookup[n];
    }
}
