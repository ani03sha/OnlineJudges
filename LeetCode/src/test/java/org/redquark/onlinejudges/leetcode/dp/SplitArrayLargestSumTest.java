package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitArrayLargestSumTest {

    private final SplitArrayLargestSum testObject = new SplitArrayLargestSum();

    @Test
    public void testSplitArray() {
        int[] nums = new int[]{7, 2, 5, 10, 8};
        int m = 2;
        assertEquals(18, testObject.splitArray(nums, m));

        nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(9, testObject.splitArray(nums, m));

        nums = new int[]{1, 4, 4};
        m = 3;
        assertEquals(4, testObject.splitArray(nums, m));
    }
}