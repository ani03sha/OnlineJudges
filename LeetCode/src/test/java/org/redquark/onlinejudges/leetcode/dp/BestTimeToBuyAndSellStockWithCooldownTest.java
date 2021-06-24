package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockWithCooldownTest {

    private final BestTimeToBuyAndSellStockWithCooldown testObject = new BestTimeToBuyAndSellStockWithCooldown();

    @Test
    void testMaxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        assertEquals(3, testObject.maxProfit(prices));

        prices = new int[]{1};
        assertEquals(0, testObject.maxProfit(prices));
    }
}