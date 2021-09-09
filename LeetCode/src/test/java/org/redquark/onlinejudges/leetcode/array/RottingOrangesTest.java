package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {

    private final RottingOranges testObject = new RottingOranges();

    @Test
    public void testOrangesRotting() {
        int[][] grid = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, testObject.orangesRotting(grid));

        grid = new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        assertEquals(-1, testObject.orangesRotting(grid));

        grid = new int[][]{
                {0, 2}
        };
        assertEquals(0, testObject.orangesRotting(grid));
    }
}