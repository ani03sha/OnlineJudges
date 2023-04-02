package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // Special cases
        if (spells == null || spells.length == 0 || potions == null || potions.length == 0) {
            return new int[]{};
        }
        // Lengths of the arrays
        int m = spells.length;
        int n = potions.length;
        // Array to store the successful pairs
        int[] pairs = new int[m];
        // Sort the potions array
        Arrays.sort(potions);
        for (int i = 0; i < m; i++) {
            // Left and right pointers for the portions array
            int left = 0;
            int right = n - 1;
            // Loop until the pointers meet
            while (left <= right) {
                // Get the middle index
                int middle = left + (right - left) / 2;
                long product = (long) spells[i] * potions[middle];
                if (product < success) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            pairs[i] = n - left;
        }
        return pairs;
    }
}
