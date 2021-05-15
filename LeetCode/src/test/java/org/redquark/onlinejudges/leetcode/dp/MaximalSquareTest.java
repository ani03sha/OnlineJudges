package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalSquareTest {

    private final MaximalSquare testObject = new MaximalSquare();

    @Test
    public void testMaximalSquare() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, testObject.maximalSquare(matrix));

        matrix = new char[][]{
                {'0', '1'},
                {'1', '0'}
        };
        assertEquals(1, testObject.maximalSquare(matrix));

        matrix = new char[][]{
                {'0'}
        };
        assertEquals(0, testObject.maximalSquare(matrix));
    }
}