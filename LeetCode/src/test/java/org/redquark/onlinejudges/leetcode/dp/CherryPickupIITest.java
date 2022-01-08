package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CherryPickupIITest {

    private final CherryPickupII testObject = new CherryPickupII();

    @Test
    public void cherryPickup() {
        int[][] grid = new int[][]{
                {3, 1, 1},
                {2, 5, 1},
                {1, 5, 5},
                {2, 1, 1}
        };
        assertEquals(24, testObject.cherryPickup(grid));

        grid = new int[][]{
                {1, 0, 0, 0, 0, 0, 1},
                {2, 0, 0, 0, 0, 3, 0},
                {2, 0, 9, 0, 0, 0, 0},
                {0, 3, 0, 5, 4, 0, 0},
                {1, 0, 2, 3, 0, 0, 6}
        };
        assertEquals(28, testObject.cherryPickup(grid));
    }
}