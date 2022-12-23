package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumTest {

    private final TargetSum testObject = new TargetSum();

    @Test
    public void testFindTargetSumWays() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int target = 3;
        assertEquals(5, testObject.findTargetSumWays(nums, target));

        nums = new int[]{1};
        target = 1;
        assertEquals(1, testObject.findTargetSumWays(nums, target));
    }
}