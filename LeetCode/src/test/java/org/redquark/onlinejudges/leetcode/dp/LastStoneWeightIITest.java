package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastStoneWeightIITest {

    private final LastStoneWeightII testObject = new LastStoneWeightII();

    @Test
    public void testLastStoneWeightII() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        assertEquals(1, testObject.lastStoneWeightII(stones));

        stones = new int[]{31, 26, 33, 21, 40};
        assertEquals(5, testObject.lastStoneWeightII(stones));

        stones = new int[]{1, 2};
        assertEquals(1, testObject.lastStoneWeightII(stones));
    }
}