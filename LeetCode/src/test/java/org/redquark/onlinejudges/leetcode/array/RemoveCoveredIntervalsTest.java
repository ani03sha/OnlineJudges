package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCoveredIntervalsTest {

    private final RemoveCoveredIntervals testObject = new RemoveCoveredIntervals();

    @Test
    public void testRemoveCoveredIntervals() {
        int[][] intervals = new int[][]{
                {1, 4},
                {3, 6},
                {2, 8}
        };
        assertEquals(2, testObject.removeCoveredIntervals(intervals));

        intervals = new int[][]{
                {1, 4},
                {2, 3}
        };
        assertEquals(1, testObject.removeCoveredIntervals(intervals));
    }
}