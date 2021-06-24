package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private final BestTimeToBuyAndSellStockWithTransactionFee testObject = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    void testMaxProfit() {
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        int fee = 2;
        assertEquals(8, testObject.maxProfit(prices, fee));

        prices = new int[]{1, 3, 7, 5, 10, 3};
        fee = 3;
        assertEquals(6, testObject.maxProfit(prices, fee));
    }
}