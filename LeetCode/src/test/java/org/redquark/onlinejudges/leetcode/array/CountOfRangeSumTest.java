package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOfRangeSumTest {

    private final CountOfRangeSum testObject = new CountOfRangeSum();

    @Test
    public void testCountRangeSum() {
        int[] nums = new int[]{-2, 5, -1};
        int lower = -2;
        int upper = 2;
        assertEquals(3, testObject.countRangeSum(nums, lower, upper));

        nums = new int[]{0};
        lower = 0;
        upper = 0;
        assertEquals(1, testObject.countRangeSum(nums, lower, upper));
    }
}