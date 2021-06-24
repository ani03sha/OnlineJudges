package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        // Special cases
        if (prices == null || prices.length < 2) {
            return 0;
        }
        // Since we cannot buy second share before selling
        // the first one, we can just go sequentially and
        // buy stock and sell it if the next element is greater
        // than the last element
        int totalProfit = 0;
        // Loop through the array
        for (int i = 1; i < prices.length; i++) {
            totalProfit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return totalProfit;
    }
}
