package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortEvenAndOddIndicesIndependentlyTest {

    private final SortEvenAndOddIndicesIndependently testObject = new SortEvenAndOddIndicesIndependently();

    @Test
    public void testSortEvenOdd() {
        int[] nums = new int[]{4, 1, 2, 3};
        int[] expected = new int[]{2, 3, 4, 1};
        assertArrayEquals(expected, testObject.sortEvenOdd(nums));

        nums = new int[]{2, 1};
        expected = new int[]{2, 1};
        assertArrayEquals(expected, testObject.sortEvenOdd(nums));
    }
}