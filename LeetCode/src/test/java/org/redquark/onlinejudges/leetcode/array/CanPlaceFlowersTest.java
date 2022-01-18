package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {

    private final CanPlaceFlowers testObject = new CanPlaceFlowers();

    @Test
    public void testCanPlaceFlowers() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(testObject.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[]{1, 0, 0, 0, 1};
        n = 2;
        assertFalse(testObject.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[]{0, 0, 1, 0, 0};
        n = 1;
        assertTrue(testObject.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[]{1, 0, 0, 0, 0, 1};
        n = 2;
        assertFalse(testObject.canPlaceFlowers(flowerbed, n));

        flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        assertTrue(testObject.canPlaceFlowers(flowerbed, n));
    }
}