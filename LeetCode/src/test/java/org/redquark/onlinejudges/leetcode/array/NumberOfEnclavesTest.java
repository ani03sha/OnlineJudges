package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfEnclavesTest {

    private final NumberOfEnclaves testObject = new NumberOfEnclaves();

    @Test
    public void testNumEnclaves() {
        int[][] grid = new int[][]{
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        assertEquals(3, testObject.numEnclaves(grid));

        grid = new int[][]{
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        assertEquals(0, testObject.numEnclaves(grid));
    }
}