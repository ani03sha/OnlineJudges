package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeMaximumOfArrayTest {

    private final MinimizeMaximumOfArray testObject = new MinimizeMaximumOfArray();

    @Test
    public void testMinimizeArrayValue() {
        int[] nums = new int[]{3, 7, 1, 6};
        assertEquals(5, testObject.minimizeArrayValue(nums));

        nums = new int[]{10, 1};
        assertEquals(10, testObject.minimizeArrayValue(nums));
    }
}