package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    private final RotateArray testObject = new RotateArray();

    @Test
    public void testRotate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, testObject.rotate(nums, k));

        nums = new int[]{-1, -100, 3, 99};
        k = 2;
        expected = new int[]{3, 99, -1, -100};
        assertArrayEquals(expected, testObject.rotate(nums, k));
    }
}