package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumIncreasingSubsequenceTest {

    private final MaximumSumIncreasingSubsequence testObject = new MaximumSumIncreasingSubsequence();

    @Test
    public void testMaxSumSubsequence() {
        int[] nums = new int[]{101, 4, 98, 103};
        assertEquals(205, testObject.maxSumSubsequence(nums));

        nums = new int[]{101, 4, 95, 103};
        assertEquals(204, testObject.maxSumSubsequence(nums));
    }
}