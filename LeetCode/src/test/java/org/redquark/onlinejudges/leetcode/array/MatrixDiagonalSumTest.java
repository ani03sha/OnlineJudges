package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDiagonalSumTest {

    private final MatrixDiagonalSum testObject = new MatrixDiagonalSum();

    @Test
    public void testDiagonalSum() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(25, testObject.diagonalSum(matrix));

        matrix = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        assertEquals(8, testObject.diagonalSum(matrix));
    }
}