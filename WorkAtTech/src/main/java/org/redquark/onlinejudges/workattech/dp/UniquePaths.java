package org.redquark.onlinejudges.workattech.dp;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        // Special case
        if (m <= 0 || n <= 0) {
            return 0;
        }
        final int MODULUS = 1000000007;
        // Lookup table to store unique ways to
        // reach the cell represented by i, j
        int[][] lookup = new int[m][n];
        // For the first column, we can only come from
        // the top
        for (int i = 0; i < m; i++) {
            lookup[i][0] = 1;
        }
        // For the first row, we can only come from
        // the right
        for (int j = 0; j < n; j++) {
            lookup[0][j] = 1;
        }
        // Populate the table for the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                lookup[i][j] = lookup[i - 1][j] % MODULUS + lookup[i][j - 1] % MODULUS;
            }
        }
        return lookup[m - 1][n - 1] % MODULUS;
    }
}
