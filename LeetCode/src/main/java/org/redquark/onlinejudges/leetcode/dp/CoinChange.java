package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        // Special case
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        // Lookup table to store the minimum number of coins needed
        // to make a certain amount, i.e., dp[i] => minimum coins
        // needed to make i amount.
        int[] lookup = new int[amount + 1];
        // Fill the array with default values
        Arrays.fill(lookup, Integer.MAX_VALUE);
        // Zero coins are needed to make 0 amount
        lookup[0] = 0;
        // Fill the lookup table for remaining amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                // If it is possible to make i amount with coin
                if (coin <= i) {
                    int difference = lookup[i - coin];
                    if (difference != Integer.MAX_VALUE) {
                        lookup[i] = Math.min(lookup[i], difference + 1);
                    }
                }
            }
        }
        return lookup[amount] == Integer.MAX_VALUE ? -1 : lookup[amount];
    }
}
