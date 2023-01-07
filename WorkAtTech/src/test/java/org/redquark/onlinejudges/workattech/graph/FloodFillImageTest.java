package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFillImageTest {

    private final FloodFillImage testObject = new FloodFillImage();

    @Test
    public void testApplyFloodFill() {
        int[][] image = new int[][]{
                {1, 2, 1, 2},
                {2, 2, 2, 1},
                {1, 2, 2, 1},
                {2, 1, 2, 1}
        };
        int x = 0;
        int y = 1;
        int color = 3;
        int[][] expected = new int[][]{
                {1, 3, 1, 2},
                {3, 3, 3, 1},
                {1, 3, 3, 1},
                {2, 1, 3, 1}
        };
        assertArrayEquals(expected, testObject.applyFloodFill(image, x, y, color));
    }
}