package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeIITest {

    private final CoinChangeII testObject = new CoinChangeII();

    @Test
    public void testChange() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 5;
        assertEquals(4, testObject.change(amount, coins));

        coins = new int[]{2};
        amount = 3;
        assertEquals(0, testObject.change(amount, coins));

        coins = new int[]{10};
        amount = 10;
        assertEquals(1, testObject.change(amount, coins));
    }
}