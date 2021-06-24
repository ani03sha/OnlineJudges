package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        // Special cases
        if (prices == null || prices.length < 2) {
            return 0;
        }
        // Length of the array
        int n = prices.length;
        // Buying and selling price arrays
        int[] buyingPrices = new int[n];
        int[] sellingPrices = new int[n];
        // Buying for the first day
        buyingPrices[0] = -prices[0] - fee;
        // Calculate for remaining stocks
        for (int i = 1; i < n; i++) {
            buyingPrices[i] = Math.max(buyingPrices[i - 1], sellingPrices[i - 1] - prices[i] - fee);
            sellingPrices[i] = Math.max(sellingPrices[i - 1], buyingPrices[i - 1] + prices[i]);
        }
        return sellingPrices[n - 1];
    }
}
