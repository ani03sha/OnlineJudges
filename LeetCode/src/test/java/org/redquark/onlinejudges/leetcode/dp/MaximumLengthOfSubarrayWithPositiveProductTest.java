package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLengthOfSubarrayWithPositiveProductTest {

    private final MaximumLengthOfSubarrayWithPositiveProduct testObject = new MaximumLengthOfSubarrayWithPositiveProduct();

    @Test
    public void testGetMaxLen() {
        int[] nums = new int[]{1, -2, -3, 4};
        assertEquals(4, testObject.getMaxLen(nums));

        nums = new int[]{0, 1, -2, -3, -4};
        assertEquals(3, testObject.getMaxLen(nums));

        nums = new int[]{-1, -2, -3, 0, 1};
        assertEquals(2, testObject.getMaxLen(nums));

        nums = new int[]{-1, 2};
        assertEquals(1, testObject.getMaxLen(nums));

        nums = new int[]{1, 2, 3, 5, -6, 4, 0, 10};
        assertEquals(4, testObject.getMaxLen(nums));

    }
}