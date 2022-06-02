package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransposeMatrixTest {

    private final TransposeMatrix testObject = new TransposeMatrix();

    @Test
    public void testTranspose() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        assertArrayEquals(expected, testObject.transpose(matrix));

        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        expected = new int[][]{
                {1, 4},
                {2, 5},
                {3, 6}
        };
        assertArrayEquals(expected, testObject.transpose(matrix));
    }
}