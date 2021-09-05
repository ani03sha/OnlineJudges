package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    private final MaximumProductSubarray testObject = new MaximumProductSubarray();

    @Test
    public void testMaxProduct() {
        int[] nums = new int[]{2, 3, -2, 4};
        assertEquals(6, testObject.maxProduct(nums));

        nums = new int[]{-2, 0, -1};
        assertEquals(0, testObject.maxProduct(nums));
    }
}