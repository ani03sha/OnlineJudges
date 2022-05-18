package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArrayTest {

    private final ConcatenationOfArray testObject = new ConcatenationOfArray();

    @Test
    public void testGetConcatenation() {
        int[] nums = new int[]{1, 2, 1};
        int[] expected = new int[]{1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, testObject.getConcatenation(nums));

        nums = new int[]{1, 3, 2, 1};
        expected = new int[]{1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expected, testObject.getConcatenation(nums));
    }
}