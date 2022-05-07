package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class LongestCommonSubsequence {

    /**
     * Time - O(mn)
     * Space - O(mn)
     */
    public int longestCommonSubsequenceOne(String text1, String text2) {
        // Special cases
        if (text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty()) {
            return 0;
        }
        // Lengths of two strings
        int m = text1.length();
        int n = text2.length();
        // Lookup table to store the longest common subsequence until
        // the i-th index in text1 and j-th index in text2.
        int[][] lookup = new int[m + 1][n + 1];
        // Loop through the strings
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If both the characters are same, then we need to just
                // add 1 to the value at i - 1, j - 1
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                }
                // Else, we will take the maximum of previous row and previous
                // column value
                else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }

    public int longestCommonSubsequenceTwo(String text1, String text2) {
        if (text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty()) {
            return 0;
        }
        // Lengths of two strings
        int m = text1.length();
        int n = text2.length();
        // Lookup table to store the longest common subsequence until
        // the i-th index in text1 and j-th index in text2.
        int[][] lookup = new int[2][n + 1];
        // Index to switch between 0 and 1 - for previous row
        int index = 0;
        // Loop through the strings
        for (int i = 0; i <= m; i++) {
            // Index to switch between 0 and 1 - for previous row
            index = i & 1;
            for (int j = 0; j <= n; j++) {
                // If any of the index is 0, then we have no matching
                // character
                if (i == 0 || j == 0) {
                    lookup[index][j] = 0;
                }
                // If both the characters are same, then we will add 1 to the
                // value from the value at indices i - 1 and j - 1
                else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[index][j] = 1 + lookup[1 - index][j - 1];
                }
                // If the current characters are not same, then we need maximum
                // of the values in the previous row or column
                else {
                    lookup[index][j] = Math.max(lookup[1 - index][j], lookup[index][j - 1]);
                }
            }
        }
        return lookup[index][n];
    }
}
