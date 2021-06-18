package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class LongestPalindromicSubsequence {

    public int longestPalindromeSubsequence(String s) {
        // Special cases
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Lookup table to store longest palindromic subsequence
        // between the indices i and j
        int[][] lookup = new int[n][n];
        // Populate the table
        for (int i = n - 1; i >= 0; i--) {
            // Longest palindromic subsequence length for
            // a string of length 1 is 1.
            lookup[i][i] = 1;
            // For the remaining places
            for (int j = i + 1; j < n; j++) {
                // If character at both the indices are same
                if (s.charAt(i) == s.charAt(j)) {
                    lookup[i][j] = 2 + lookup[i + 1][j - 1];
                } else {
                    lookup[i][j] = Math.max(lookup[i + 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[0][n - 1];
    }
}
