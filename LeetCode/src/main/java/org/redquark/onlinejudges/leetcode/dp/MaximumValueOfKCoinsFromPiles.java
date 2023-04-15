package org.redquark.onlinejudges.leetcode.dp;

import java.util.List;

public class MaximumValueOfKCoinsFromPiles {

    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        // Special case
        if (piles == null || piles.isEmpty()) {
            return 0;
        }
        // Total number of piles
        int n = piles.size();
        // Lookup table to store the maximum value when we take j
        // coins from the leftmost i piles
        int[][] lookup = new int[n + 1][k + 1];
        // Populate the table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                // Current maximum sum
                int currentSum = 0;
                // We can tak at most allowed coins which is a minimum of
                // current pile's size and current coin in consideration
                // which is represented by j.
                int atMostCoins = Math.min(piles.get(i - 1).size(), j);
                for (int currentCoins = 0; currentCoins <= atMostCoins; currentCoins++) {
                    if (currentCoins > 0) {
                        currentSum += piles.get(i - 1).get(currentCoins - 1);
                    }
                    lookup[i][j] = Math.max(lookup[i][j], lookup[i - 1][j - currentCoins] + currentSum);
                }
            }
        }
        return lookup[n][k];
    }
}
