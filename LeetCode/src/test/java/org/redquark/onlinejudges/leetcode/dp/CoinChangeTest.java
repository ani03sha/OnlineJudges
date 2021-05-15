package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    private final CoinChange testObject = new CoinChange();

    @Test
    public void testCoinChange() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        assertEquals(3, testObject.coinChange(coins, amount));

        coins = new int[]{2};
        amount = 3;
        assertEquals(-1, testObject.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 0;
        assertEquals(0, testObject.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 1;
        assertEquals(1, testObject.coinChange(coins, amount));

        coins = new int[]{1};
        amount = 2;
        assertEquals(2, testObject.coinChange(coins, amount));
    }
}