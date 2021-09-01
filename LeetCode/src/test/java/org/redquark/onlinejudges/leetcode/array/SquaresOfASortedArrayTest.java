package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfASortedArrayTest {

    private final SquaresOfASortedArray testObject = new SquaresOfASortedArray();

    @Test
    public void testSortedSquares() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};
        assertArrayEquals(expected, testObject.sortedSquares(nums));

        nums = new int[]{-7, -3, 2, 3, 11};
        expected = new int[]{4, 9, 9, 49, 121};
        assertArrayEquals(expected, testObject.sortedSquares(nums));
    }
}