package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerTest {

    private final GuessNumberHigherOrLower testObject = new GuessNumberHigherOrLower();

    @Test
    public void testGuessNumber() {
        testObject.pick = 6;
        assertEquals(6, testObject.guessNumber(10));

        testObject.pick = 1;
        assertEquals(1, testObject.guessNumber(1));

        testObject.pick = 1;
        assertEquals(1, testObject.guessNumber(2));

        testObject.pick = 2;
        assertEquals(2, testObject.guessNumber(2));
    }
}