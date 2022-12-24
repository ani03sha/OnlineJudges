package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfLongestIncreasingSubsequenceTest {

    private final NumberOfLongestIncreasingSubsequence testObject = new NumberOfLongestIncreasingSubsequence();

    @Test
    public void testFindNumberOfLIS() {
        int[] nums = new int[]{1, 3, 5, 4, 7};
        assertEquals(2, testObject.findNumberOfLIS(nums));

        nums = new int[]{2, 2, 2, 2, 2};
        assertEquals(5, testObject.findNumberOfLIS(nums));
    }
}