package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumOperationsToReduceXToZeroTest {

    private final MinimumOperationsToReduceXToZero testObject = new MinimumOperationsToReduceXToZero();

    @Test
    public void testMinOperationsOne() {
        int[] nums = new int[]{1, 1, 4, 2, 3};
        int x = 5;
        assertEquals(2, testObject.minOperationsOne(nums, x));

        nums = new int[]{5, 6, 7, 8, 9};
        x = 4;
        assertEquals(-1, testObject.minOperationsOne(nums, x));

        nums = new int[]{3, 2, 20, 1, 1, 3};
        x = 10;
        assertEquals(5, testObject.minOperationsOne(nums, x));
    }

    @Test
    public void testMinOperationsTwo() {
        int[] nums = new int[]{1, 1, 4, 2, 3};
        int x = 5;
        assertEquals(2, testObject.minOperationsTwo(nums, x));

        nums = new int[]{5, 6, 7, 8, 9};
        x = 4;
        assertEquals(-1, testObject.minOperationsTwo(nums, x));

        nums = new int[]{3, 2, 20, 1, 1, 3};
        x = 10;
        assertEquals(5, testObject.minOperationsTwo(nums, x));
    }
}