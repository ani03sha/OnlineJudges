package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIVTest {

    private final CombinationSumIV testObject = new CombinationSumIV();

    @Test
    public void testCombinationSum4() {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        assertEquals(7, testObject.combinationSum4(nums, target));

        nums = new int[]{9};
        target = 3;
        assertEquals(0, testObject.combinationSum4(nums, target));
    }
}