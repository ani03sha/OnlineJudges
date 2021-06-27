package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneGameTest {

    private final StoneGame testObject = new StoneGame();

    @Test
    public void testStoneGame() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(testObject.stoneGame(piles));
    }
}