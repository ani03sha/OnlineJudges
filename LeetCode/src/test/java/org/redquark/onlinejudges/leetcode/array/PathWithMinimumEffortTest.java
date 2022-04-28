package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathWithMinimumEffortTest {

    private final PathWithMinimumEffort testObject = new PathWithMinimumEffort();

    @Test
    public void testMinimumEffortPath() {
        int[][] heights = new int[][]{
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        };
        assertEquals(2, testObject.minimumEffortPath(heights));

        heights = new int[][]{
                {1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 2, 1}
        };
        assertEquals(0, testObject.minimumEffortPath(heights));

        heights = new int[][]{
                {1, 2, 3},
                {3, 8, 4},
                {5, 3, 5}
        };
        assertEquals(1, testObject.minimumEffortPath(heights));
    }
}