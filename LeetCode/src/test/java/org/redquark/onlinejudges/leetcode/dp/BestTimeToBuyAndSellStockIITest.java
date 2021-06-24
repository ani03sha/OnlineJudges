package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII testObject = new BestTimeToBuyAndSellStockII();

    @Test
    public void maxProfit() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(7, testObject.maxProfit(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        assertEquals(4, testObject.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, testObject.maxProfit(prices));
    }
}