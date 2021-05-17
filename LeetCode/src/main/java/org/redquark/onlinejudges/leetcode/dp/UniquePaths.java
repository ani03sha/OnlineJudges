package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        // Special case
        if (m <= 0 && n <= 0) {
            return 0;
        }
        // Lookup table to store unique paths to reach
        // a certain cell i.e., lookup[i][j] => unique paths
        // to reach a cell with coordinates i and j.
        int[][] lookup = new int[m + 1][n + 1];
        // For the first row, we can move only horizontally,
        // therefore, there is only one path
        for (int j = 0; j < n; j++) {
            lookup[0][j] = 1;
        }
        // For the first column, we can move only vertically,
        // therefore, there is only one path
        for (int i = 0; i < m; i++) {
            lookup[i][0] = 1;
        }
        // Populate for remaining paths
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1];
            }
        }
        return lookup[m - 1][n - 1];
    }
}
