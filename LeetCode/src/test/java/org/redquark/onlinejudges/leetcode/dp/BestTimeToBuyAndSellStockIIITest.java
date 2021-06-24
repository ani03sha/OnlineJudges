package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIIITest {

    private final BestTimeToBuyAndSellStockIII testObject = new BestTimeToBuyAndSellStockIII();

    @Test
    public void testMaxProfit() {
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals(6, testObject.maxProfit(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        assertEquals(4, testObject.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, testObject.maxProfit(prices));

        prices = new int[]{1};
        assertEquals(0, testObject.maxProfit(prices));
    }
}