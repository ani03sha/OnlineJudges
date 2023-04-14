package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf testObject = new ProductOfArrayExceptSelf();

    @Test
    public void testProductExceptSelfSolutionOne() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, testObject.productExceptSelfSolutionOne(nums));

        nums = new int[]{-1, 1, 0, -3, 3};
        expected = new int[]{0, 0, 9, 0, 0};
        assertArrayEquals(expected, testObject.productExceptSelfSolutionOne(nums));
    }

    @Test
    public void testProductExceptSelfSolutionTwo() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, testObject.productExceptSelfSolutionTwo(nums));

        nums = new int[]{-1, 1, 0, -3, 3};
        expected = new int[]{0, 0, 9, 0, 0};
        assertArrayEquals(expected, testObject.productExceptSelfSolutionTwo(nums));
    }
}