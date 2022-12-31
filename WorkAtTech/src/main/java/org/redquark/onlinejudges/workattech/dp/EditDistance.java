package org.redquark.onlinejudges.workattech.dp;

public class EditDistance {

    public int minOperations(String s1, String s2) {
        // Special case
        if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs!");
        }
        // Lengths of both the strings
        int m = s1.length();
        int n = s2.length();
        // Lookup table to store number of operations
        // needed to convert s1 to s2 until the indices
        // i and j respectively
        int[][] lookup = new int[m + 1][n + 1];
        // If one string is empty then we need the
        // length of another string to convert it
        // into the first string
        for (int i = 1; i <= m; i++) {
            lookup[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            lookup[0][j] = j;
        }
        // Loop for remaining characters
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If both the characters are same,
                // we don't do any operation
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1];
                }
                // If the characters are not same, we
                // will either insert, replace or delete
                else {
                    int replace = 1 + lookup[i - 1][j - 1];
                    int insert = 1 + lookup[i][j - 1];
                    int delete = 1 + lookup[i - 1][j];
                    // Minimum of these three operations
                    lookup[i][j] = Math.min(replace, Math.min(insert, delete));
                }
            }
        }
        return lookup[m][n];
    }
}
