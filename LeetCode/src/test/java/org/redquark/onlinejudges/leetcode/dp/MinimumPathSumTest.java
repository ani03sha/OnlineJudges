package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPathSumTest {

    private final MinimumPathSum testObject = new MinimumPathSum();

    @Test
    public void testMinPathSum() {
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, testObject.minPathSum(grid));

        grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        assertEquals(12, testObject.minPathSum(grid));
    }
}