package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        // Lengths of the strings
        int m = text1.length();
        int n = text2.length();
        // Lookup table to store the length of longest
        // common subsequence ending at i-th and j-th
        // characters of text1 and text2 respectively.
        int[][] lookup = new int[m + 1][n + 1];
        // Populate the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters are same
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                } else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }
}
