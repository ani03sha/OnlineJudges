package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroOneMatrixTest {

    private final ZeroOneMatrix testObject = new ZeroOneMatrix();

    @Test
    public void testUpdateMatrix() {
        int[][] matrix = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertArrayEquals(expected, testObject.updateMatrix(matrix));

        matrix = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        assertArrayEquals(expected, testObject.updateMatrix(matrix));
    }
}