package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockIVTest {

    private final BestTimeToBuyAndSellStockIV testObject = new BestTimeToBuyAndSellStockIV();

    @Test
    void testMaxProfit() {
        int k = 2;
        int[] prices = new int[]{2, 4, 1};
        assertEquals(2, testObject.maxProfit(k, prices));

        k = 2;
        prices = new int[]{3, 2, 6, 5, 0, 3};
        assertEquals(7, testObject.maxProfit(k, prices));
    }
}