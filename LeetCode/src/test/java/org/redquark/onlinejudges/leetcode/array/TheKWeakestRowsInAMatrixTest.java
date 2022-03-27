package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheKWeakestRowsInAMatrixTest {

    private final TheKWeakestRowsInAMatrix testObject = new TheKWeakestRowsInAMatrix();

    @Test
    public void testKWeakestRows() {
        int[][] mat = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] expected = new int[]{2, 0, 3};
        assertArrayEquals(expected, testObject.kWeakestRows(mat, k));

        mat = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        k = 2;
        expected = new int[]{0, 2};
        assertArrayEquals(expected, testObject.kWeakestRows(mat, k));
    }
}