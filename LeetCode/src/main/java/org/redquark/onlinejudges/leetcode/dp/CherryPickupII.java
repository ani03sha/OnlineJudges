package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class CherryPickupII {

    public int cherryPickup(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = grid.length;
        int n = grid[0].length;
        // Lookup table to store the number of cherries collected
        // by the robots. Here, lookup[i][j][k] represents the total
        // number of cherries picked up by both robots until the
        // i-th row and column j and k respectively.
        int[][][] lookup = new int[m][n][n];
        // Since we cannot move further down from the last row,
        // therefore the lookup table's last row will be filled
        // with the same values in the last row of grid
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                // If both robots are in the same cell, we will consider
                // only one
                lookup[m - 1][j][k] = j == k ? grid[m - 1][j] : grid[m - 1][j] + grid[m - 1][k];
            }
        }
        // Populate the lookup table for other cells, moving from bottom to top.
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // Maximum cherries at current row only
                    int currentCherries = j == k ? grid[i][j] : grid[i][j] + grid[i][k];
                    // Choice of the cell to be selected from the previous
                    // row (remember we are moving upwards)
                    int previousCherries = calculateMaximumFromRow(lookup, i, j, k, n);
                    // Maximum cherries in 9 (3 * 3) choices
                    lookup[i][j][k] = currentCherries + previousCherries;
                }
            }
        }
        return lookup[0][0][n - 1];
    }

    private int calculateMaximumFromRow(int[][][] lookup, int i, int j, int k, int n) {
        int max = Integer.MIN_VALUE;
        for (int a = j - 1; a <= j + 1; a++) {
            for (int b = k - 1; b <= k + 1; b++) {
                // Check if the indices are not out of bounds
                if (a >= 0 && a < n && b >= 0 && b < n) {
                    max = Math.max(max, lookup[i + 1][a][b]);
                }
            }
        }
        return max;
    }
}
