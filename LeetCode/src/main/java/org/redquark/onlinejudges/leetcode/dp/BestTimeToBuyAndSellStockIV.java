package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class BestTimeToBuyAndSellStockIV {

    public int maxProfit(int k, int[] prices) {
        // Special case
        if (prices == null || prices.length < 2 || k < 1) {
            return 0;
        }
        // Array for buying prices
        int[] buyingPrices = new int[k];
        // Fill the buying prices
        Arrays.fill(buyingPrices, Integer.MIN_VALUE);
        // Array for selling prices
        int[] sellingPrices = new int[k];
        // Calculate for every combination of stock prices
        for (int price : prices) {
            // Buy first stock
            buyingPrices[0] = Math.max(buyingPrices[0], -price);
            sellingPrices[0] = Math.max(sellingPrices[0], buyingPrices[0] + price);
            // Buy remaining k - 1 stocks
            for (int j = 1; j < k; j++) {
                buyingPrices[j] = Math.max(buyingPrices[j], sellingPrices[j - 1] - price);
                sellingPrices[j] = Math.max(sellingPrices[j], buyingPrices[j] + price);
            }
        }
        return sellingPrices[k - 1];
    }
}
