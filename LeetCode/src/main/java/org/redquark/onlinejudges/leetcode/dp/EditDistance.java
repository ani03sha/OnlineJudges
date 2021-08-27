package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class EditDistance {

    public int minDistance(String word1, String word2) {
        // Lengths of the strings
        int m = word1.length();
        int n = word2.length();
        // Lookup table to store the edit distance between first
        // i characters of word1 and first j characters of word2
        int[][] lookup = new int[m + 1][n + 1];
        // Populate the table for all characters of word1 but no
        // character of word2
        for (int i = 1; i <= m; i++) {
            lookup[i][0] = i;
        }
        // Populate the table for all characters of word2 but no
        // character of word1
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = j;
        }
        // Cost for remaining positions
        int cost;
        // Populate the table for remaining positions
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters are same at i-th and j-th position,
                // we don't have to do anything
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    cost = 0;
                } else {
                    cost = 1;
                }
                lookup[i][j] = Math.min(cost + lookup[i - 1][j - 1], Math.min(1 + lookup[i - 1][j], 1 + lookup[i][j - 1]));
            }
        }
        return lookup[m][n];
    }
}
