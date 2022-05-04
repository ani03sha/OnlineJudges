package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTest {

    private final MaxNumberOfKSumPairs testObject = new MaxNumberOfKSumPairs();

    @Test
    public void testMaxOperations() {
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        assertEquals(2, testObject.maxOperations(nums, k));

        nums = new int[]{3, 1, 3, 4, 3};
        k = 6;
        assertEquals(1, testObject.maxOperations(nums, k));
    }
}