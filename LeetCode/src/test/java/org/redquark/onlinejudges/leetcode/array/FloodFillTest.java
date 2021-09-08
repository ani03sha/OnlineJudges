package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFillTest {

    private final FloodFill testObject = new FloodFill();

    @Test
    public void testFloodFill() {
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertArrayEquals(expected, testObject.floodFill(image, sr, sc, newColor));

        image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        sr = 0;
        sc = 0;
        expected = new int[][]{
                {2, 2, 2},
                {2, 2, 2}
        };
        assertArrayEquals(expected, testObject.floodFill(image, sr, sc, newColor));
    }
}