package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAnArrayTest {

    private final SortAnArray testObject = new SortAnArray();

    @Test
    public void testSortArray() {
        int[] nums = new int[]{5, 2, 3, 1};
        int[] expected = new int[]{1, 2, 3, 5};
        assertArrayEquals(expected, testObject.sortArray(nums));

        nums = new int[]{5, 1, 1, 2, 0, 0};
        expected = new int[]{0, 0, 1, 1, 2, 5};
        assertArrayEquals(expected, testObject.sortArray(nums));
    }
}