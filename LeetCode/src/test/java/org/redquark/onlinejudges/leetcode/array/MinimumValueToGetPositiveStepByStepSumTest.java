package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumValueToGetPositiveStepByStepSumTest {

    private final MinimumValueToGetPositiveStepByStepSum testObject = new MinimumValueToGetPositiveStepByStepSum();

    @Test
    public void testMinStartValue() {
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        assertEquals(5, testObject.minStartValue(nums));

        nums = new int[]{1, 2};
        assertEquals(1, testObject.minStartValue(nums));

        nums = new int[]{1, -2, -3};
        assertEquals(5, testObject.minStartValue(nums));
    }
}