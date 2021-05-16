package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class DungeonGame {

    public int calculateMinimumHP(int[][] dungeon) {
        // Special case
        if (dungeon == null || dungeon.length == 0) {
            return 1;
        }
        // Rows and columns of the dungeon
        int m = dungeon.length;
        int n = dungeon[0].length;
        // Lookup table to store the minimum health needed
        // for a certain cell
        int[][] lookup = new int[m + 1][n + 1];
        // Fill up the lookup table with the dummy value
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, Integer.MAX_VALUE));
        // Since we need to maintain at least 1 health point
        // even after saving the princess
        lookup[m][n - 1] = 1;
        lookup[m - 1][n] = 1;
        // Traverse from bottom right to top left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int healthPointsAfter = Math.min(lookup[i + 1][j], lookup[i][j + 1]) - dungeon[i][j];
                lookup[i][j] = healthPointsAfter <= 0 ? 1 : healthPointsAfter;
            }
        }
        return lookup[0][0];
    }
}
