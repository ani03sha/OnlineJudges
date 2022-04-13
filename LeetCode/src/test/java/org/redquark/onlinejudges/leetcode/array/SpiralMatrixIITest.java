package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SpiralMatrixIITest {

    private final SpiralMatrixII testObject = new SpiralMatrixII();

    @Test
    public void testGenerateMatrix() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        assertArrayEquals(expected, testObject.generateMatrix(3));

        expected = new int[][]{
                {1}
        };
        assertArrayEquals(expected, testObject.generateMatrix(1));
    }
}