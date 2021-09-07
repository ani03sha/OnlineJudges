package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestSightSeeingPairTest {

    private final BestSightSeeingPair testObject = new BestSightSeeingPair();

    @Test
    public void testMaxScoreSightseeingPair() {
        int[] values = new int[]{8, 1, 5, 2, 6};
        assertEquals(11, testObject.maxScoreSightseeingPair(values));

        values = new int[]{1, 2};
        assertEquals(2, testObject.maxScoreSightseeingPair(values));
    }
}