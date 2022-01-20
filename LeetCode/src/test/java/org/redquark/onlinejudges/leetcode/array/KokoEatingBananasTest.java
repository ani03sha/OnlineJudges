package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KokoEatingBananasTest {

    private final KokoEatingBananas testObject = new KokoEatingBananas();

    @Test
    public void testMinEatingSpeed() {
        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;
        assertEquals(4, testObject.minEatingSpeed(piles, h));

        piles = new int[]{30, 11, 23, 4, 20};
        h = 5;
        assertEquals(30, testObject.minEatingSpeed(piles, h));

        piles = new int[]{30, 11, 23, 4, 20};
        h = 6;
        assertEquals(23, testObject.minEatingSpeed(piles, h));
    }
}