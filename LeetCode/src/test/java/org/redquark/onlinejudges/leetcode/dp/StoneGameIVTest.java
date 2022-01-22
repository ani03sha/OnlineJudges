package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneGameIVTest {

    private final StoneGameIV testObject = new StoneGameIV();

    @Test
    public void testWinnerSquareGame() {
        assertTrue(testObject.winnerSquareGame(1));
        assertFalse(testObject.winnerSquareGame(2));
        assertTrue(testObject.winnerSquareGame(4));
    }
}