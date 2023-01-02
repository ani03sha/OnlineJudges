package org.redquark.onlinejudges.leetcode.dp;

public class CoinChangeII {

    public int change(int amount, int[] coins) {
        // Special case
        if (coins == null || coins.length == 0 || amount < 0) {
            return 0;
        }
        // Lookup table to store number of ways to
        // make up the target using certain coins
        int[] lookup = new int[amount + 1];
        lookup[0] = 1;
        // Populate the table from 1 to n.
        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {
                    lookup[i] += lookup[i - coin];
                }
            }
        }
        return lookup[amount];
    }
}
