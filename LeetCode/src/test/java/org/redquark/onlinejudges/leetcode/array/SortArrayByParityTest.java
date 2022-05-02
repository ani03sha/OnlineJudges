package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayByParityTest {

    private final SortArrayByParity testObject = new SortArrayByParity();

    @Test
    public void testSortArrayByParity() {
        int[] nums = new int[]{3, 1, 2, 4};
        int[] expected = new int[]{2, 4, 3, 1};
        assertArrayEquals(expected, testObject.sortArrayByParity(nums));

        nums = new int[]{0};
        expected = new int[]{0};
        assertArrayEquals(expected, testObject.sortArrayByParity(nums));
    }
}