package org.redquark.onlinejudges.leetcode.dp;

public class MinimumInsertionStepsToMakeAStringPalindrome {

    public int minInsertions(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Lookup table to store the longest common subsequence
        // of the given string and its reverse
        int[][] lookup = new int[n + 1][n + 1];
        // Populate the table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // If the characters are same at the i-th and the (n - 1 - j)-th location
                if (s.charAt(i) == s.charAt(n - 1 - j)) {
                    lookup[i + 1][j + 1] = 1 + lookup[i][j];
                } else {
                    lookup[i + 1][j + 1] = Math.max(lookup[i + 1][j], lookup[i][j + 1]);
                }
            }
        }
        return n - lookup[n][n];
    }
}
