package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Maximum profit
        int maximumProfit = 0;
        // Minimum value of the stock
        int minimumPrice = prices[0];
        // Loop through the remaining prices
        for (int i = 1; i < prices.length; i++) {
            // Maximum profit will be calculated when will maximize
            // the difference between the current price and minimum
            // price
            maximumProfit = Math.max(maximumProfit, prices[i] - minimumPrice);
            // Minimize the price if possible
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
        return maximumProfit;
    }
}
