package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DungeonGameTest {

    private final DungeonGame testObject = new DungeonGame();

    @Test
    public void testCalculateMinimumHP() {
        int[][] dungeon = new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        };
        assertEquals(7, testObject.calculateMinimumHP(dungeon));

        dungeon = new int[][]{{0}};
        assertEquals(1, testObject.calculateMinimumHP(dungeon));
    }
}