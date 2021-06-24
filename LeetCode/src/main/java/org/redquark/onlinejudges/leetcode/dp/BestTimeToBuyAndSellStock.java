package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        // Special cases
        if (prices == null || prices.length < 2) {
            return Integer.MIN_VALUE;
        }
        // We will keep track of minimum stock price
        // and maximum profit while we are examine
        // each element of the array
        int minimumPrice = prices[0];
        int maximumProfit = Integer.MIN_VALUE;
        // Loop through the array
        for (int i = 1; i < prices.length; i++) {
            minimumPrice = Math.min(minimumPrice, prices[i]);
            maximumProfit = Math.max(maximumProfit, prices[i] - minimumPrice);
        }
        return maximumProfit;
    }
}
