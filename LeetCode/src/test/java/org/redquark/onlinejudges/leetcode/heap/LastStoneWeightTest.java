package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastStoneWeightTest {

    private final LastStoneWeight testObject = new LastStoneWeight();

    @Test
    public void testLastStoneWeight() {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        assertEquals(1, testObject.lastStoneWeight(stones));

        stones = new int[]{1};
        assertEquals(1, testObject.lastStoneWeight(stones));
    }
}