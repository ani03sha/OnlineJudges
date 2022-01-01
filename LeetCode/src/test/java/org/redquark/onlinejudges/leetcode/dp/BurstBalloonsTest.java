package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurstBalloonsTest {

    private final BurstBalloons testObject = new BurstBalloons();

    @Test
    public void testMaxCoins() {
        int[] nums = new int[]{3, 1, 5, 8};
        assertEquals(167, testObject.maxCoins(nums));

        nums = new int[]{1, 5};
        assertEquals(10, testObject.maxCoins(nums));
    }
}