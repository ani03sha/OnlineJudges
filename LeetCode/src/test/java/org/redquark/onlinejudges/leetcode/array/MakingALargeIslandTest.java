package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingALargeIslandTest {

    private final MakingALargeIsland testObject = new MakingALargeIsland();

    @Test
    public void testLargestIsland() {
        int[][] grid = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertEquals(3, testObject.largestIsland(grid));

        grid = new int[][]{
                {1, 1},
                {1, 0}
        };
        assertEquals(4, testObject.largestIsland(grid));

        grid = new int[][]{
                {1, 1},
                {1, 1}
        };
        assertEquals(4, testObject.largestIsland(grid));
    }
}