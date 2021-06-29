package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesIIITest {

    private final MaxConsecutiveOnesIII testObject = new MaxConsecutiveOnesIII();

    @Test
    public void testLongestOnes() {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        assertEquals(6, testObject.longestOnes(nums, k));

        nums = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        k = 3;
        assertEquals(10, testObject.longestOnes(nums, k));
    }
}