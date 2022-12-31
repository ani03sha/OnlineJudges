package org.redquark.onlinejudges.workattech.dp;

public class LongestCommonSubsequence {

    public int getLengthOfLCS(String s1, String s2) {
        // Special cases
        if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        // Lengths of the strings
        int m = s1.length();
        int n = s2.length();
        // Lookup table to store LCS until the
        // i-th index of s1 and the j-th index
        // of s2.
        int[][] lookup = new int[m + 1][n + 1];
        // Loop through the strings
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the current characters are same,
                // we will increment the previous LCS
                // by 1
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                }
                // If the current characters are not same,
                // we will take maximum of previous combinations
                else {
                    lookup[i][j] = Math.max(lookup[i - 1][j],
                            lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }
}
