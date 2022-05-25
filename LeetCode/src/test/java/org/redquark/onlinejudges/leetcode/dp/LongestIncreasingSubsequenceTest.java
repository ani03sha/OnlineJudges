package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence testObject = new LongestIncreasingSubsequence();

    @Test
    public void lengthOfLIS() {
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, testObject.lengthOfLIS(nums));

        nums = new int[]{0, 1, 0, 3, 2, 3};
        assertEquals(4, testObject.lengthOfLIS(nums));

        nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, testObject.lengthOfLIS(nums));
    }
}