package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class DeleteOperationForTwoStrings {

    public int minDistance(String word1, String word2) {
        // Lengths of the two strings
        int a = word1.length();
        int b = word2.length();
        // DP array to store the distances - lookup[i][j] stands
        // for distance of first i characters of word1 and
        // first j characters of word2
        int[][] lookup = new int[a + 1][b + 1];
        // Fill the values for first row and first column
        for (int i = 0; i <= a; i++) {
            lookup[i][0] = i;
        }
        for (int j = 0; j <= b; j++) {
            lookup[0][j] = j;
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1];
                } else {
                    lookup[i][j] = Math.min(Math.min(lookup[i - 1][j - 1] + 2, lookup[i - 1][j] + 1), lookup[i][j - 1] + 1);
                }
            }
        }
        return lookup[a][b];
    }
}
