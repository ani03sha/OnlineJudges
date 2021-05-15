package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectSquaresTest {

    private final PerfectSquares testObject = new PerfectSquares();

    @Test
    public void testNumSquares() {
        int n = 12;
        assertEquals(3, testObject.numSquares(n));

        n = 13;
        assertEquals(2, testObject.numSquares(n));

        n = 8765;
        assertEquals(2, testObject.numSquares(n));
    }
}