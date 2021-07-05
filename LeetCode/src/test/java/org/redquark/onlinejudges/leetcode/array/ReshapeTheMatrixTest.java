package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReshapeTheMatrixTest {

    private final ReshapeTheMatrix testObject = new ReshapeTheMatrix();

    @Test
    public void testMatrixReshape() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        int r = 1;
        int c = 4;
        int[][] expected = new int[][]{
                {1, 2, 3, 4}
        };
        assertArrayEquals(expected, testObject.matrixReshape(matrix, r, c));

        matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        r = 2;
        c = 4;
        expected = new int[][]{
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(expected, testObject.matrixReshape(matrix, r, c));
    }
}