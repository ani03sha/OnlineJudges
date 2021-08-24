package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK testObject = new SubarraySumEqualsK();

    @Test
    public void testSubarraySum() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        assertEquals(2, testObject.subarraySum(nums, k));

        nums = new int[]{1, 2, 3};
        k = 3;
        assertEquals(2, testObject.subarraySum(nums, k));
    }
}