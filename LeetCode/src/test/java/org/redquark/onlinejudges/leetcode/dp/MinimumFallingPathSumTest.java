package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumFallingPathSumTest {

    private final MinimumFallingPathSum testObject = new MinimumFallingPathSum();

    @Test
    public void testMinFallingPathSum() {
        int[][] matrix = new int[][]{
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        assertEquals(13, testObject.minFallingPathSum(matrix));

        matrix = new int[][]{
                {-19, 57},
                {-40, -5}
        };
        assertEquals(-59, testObject.minFallingPathSum(matrix));

        matrix = new int[][]{{-48}};
        assertEquals(-48, testObject.minFallingPathSum(matrix));
    }
}