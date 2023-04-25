package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    private final SortColors testObject = new SortColors();

    @Test
    public void testSortColors() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, testObject.sortColors(nums));

        nums = new int[]{2, 0, 1};
        expected = new int[]{0, 1, 2};
        assertArrayEquals(expected, testObject.sortColors(nums));
    }
}