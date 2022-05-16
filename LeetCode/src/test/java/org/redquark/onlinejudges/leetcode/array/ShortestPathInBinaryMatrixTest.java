package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathInBinaryMatrixTest {

    private final ShortestPathInBinaryMatrix testObject = new ShortestPathInBinaryMatrix();

    @Test
    public void testShortestPathBinaryMatrix() {
        int[][] grid = new int[][]{
                {0, 1},
                {1, 0}
        };
        assertEquals(2, testObject.shortestPathBinaryMatrix(grid));

        grid = new int[][]{
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        assertEquals(4, testObject.shortestPathBinaryMatrix(grid));

        grid = new int[][]{
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        assertEquals(-1, testObject.shortestPathBinaryMatrix(grid));
    }
}