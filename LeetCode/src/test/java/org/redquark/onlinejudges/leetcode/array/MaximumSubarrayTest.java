package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    private final MaximumSubarray testObject = new MaximumSubarray();

    @Test
    public void testMaxSubArray() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, testObject.maxSubArray(nums));

        nums = new int[]{1};
        assertEquals(1, testObject.maxSubArray(nums));

        nums = new int[]{5, 4, -1, 7, 8};
        assertEquals(23, testObject.maxSubArray(nums));
    }
}