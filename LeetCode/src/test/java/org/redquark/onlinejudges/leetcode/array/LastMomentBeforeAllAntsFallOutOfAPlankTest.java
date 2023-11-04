package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastMomentBeforeAllAntsFallOutOfAPlankTest {

    private final LastMomentBeforeAllAntsFallOutOfAPlank testObject =
            new LastMomentBeforeAllAntsFallOutOfAPlank();

    @Test
    public void testGetLastMoment() {
        int n = 4;
        int[] left = new int[]{4, 3};
        int[] right = new int[]{0, 1};
        assertEquals(4, testObject.getLastMoment(n, left, right));

        n = 7;
        left = new int[]{};
        right = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        assertEquals(7, testObject.getLastMoment(n, left, right));

        n = 7;
        left = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        right = new int[]{};
        assertEquals(7, testObject.getLastMoment(n, left, right));
    }
}