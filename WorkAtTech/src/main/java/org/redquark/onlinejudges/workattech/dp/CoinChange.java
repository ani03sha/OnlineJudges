package org.redquark.onlinejudges.workattech.dp;

public class CoinChange {

    public int numberOfCombinations(int[] coins, int target) {
        // Special case
        if (coins == null || coins.length == 0 || target < 0) {
            return 0;
        }
        // Lookup table to store number of ways to
        // make up the target using certain coins
        int[] lookup = new int[target + 1];
        lookup[0] = 1;
        // Populate the table from 1 to n.
        for (int coin : coins) {
            for (int i = 1; i <= target; i++) {
                if (coin <= i) {
                    lookup[i] += lookup[i - coin];
                }
            }
        }
        return lookup[target];
    }
}
