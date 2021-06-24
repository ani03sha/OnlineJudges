package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStocksTest {

    private final BestTimeToBuyAndSellStock testObject = new BestTimeToBuyAndSellStock();

    @Test
    public void testMaxProfit() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, testObject.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, testObject.maxProfit(prices));
    }
}