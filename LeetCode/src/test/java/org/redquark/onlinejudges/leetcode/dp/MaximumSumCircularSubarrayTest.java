package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumCircularSubarrayTest {

    private final MaximumSumCircularSubarray testObject = new MaximumSumCircularSubarray();

    @Test
    public void testMaxSubarraySumCircular() {
        int[] nums = new int[]{1, -2, 3, -2};
        assertEquals(3, testObject.maxSubarraySumCircular(nums));

        nums = new int[]{5, -3, 5};
        assertEquals(10, testObject.maxSubarraySumCircular(nums));

        nums = new int[]{3, -1, 2, -1};
        assertEquals(4, testObject.maxSubarraySumCircular(nums));

        nums = new int[]{3, -2, 2, -3};
        assertEquals(3, testObject.maxSubarraySumCircular(nums));

        nums = new int[]{-2, -3, -1};
        assertEquals(-1, testObject.maxSubarraySumCircular(nums));
    }
}