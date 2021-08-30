package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {

    private final MergeIntervals testObject = new MergeIntervals();

    @Test
    public void testMerge() {
        int[][] intervals = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] expected = new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
        };
        assertArrayEquals(expected, testObject.merge(intervals));

        intervals = new int[][]{
                {1, 4},
                {4, 5}
        };
        expected = new int[][]{
                {1, 5}
        };
        assertArrayEquals(expected, testObject.merge(intervals));
    }
}