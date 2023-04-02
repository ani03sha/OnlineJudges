package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SuccessfulPairsOfSpellsAndPotionsTest {

    private final SuccessfulPairsOfSpellsAndPotions testObject = new SuccessfulPairsOfSpellsAndPotions();

    @Test
    public void testSuccessfulPairs() {
        int[] spells = new int[]{5, 1, 3};
        int[] potions = new int[]{1, 2, 3, 4, 5};
        int success = 7;
        int[] expected = new int[]{4, 0, 3};
        assertArrayEquals(expected, testObject.successfulPairs(spells, potions, success));

        spells = new int[]{3, 1, 2};
        potions = new int[]{8, 5, 8};
        success = 16;
        expected = new int[]{2, 0, 2};
        assertArrayEquals(expected, testObject.successfulPairs(spells, potions, success));
    }
}