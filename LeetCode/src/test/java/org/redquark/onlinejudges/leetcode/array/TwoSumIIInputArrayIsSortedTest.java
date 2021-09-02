package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIIInputArrayIsSortedTest {

    private final TwoSumIIInputArrayIsSorted testObject = new TwoSumIIInputArrayIsSorted();

    @Test
    public void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.twoSum(nums, target));

        nums = new int[]{2, 3, 4};
        target = 6;
        expected = new int[]{1, 3};
        assertArrayEquals(expected, testObject.twoSum(nums, target));

        nums = new int[]{-1, 0};
        target = -1;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, testObject.twoSum(nums, target));
    }
}