package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Special case
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // Lookup table to store the total number of unique ways
        // to reach the current cell
        int[][] lookup = new int[m][n];
        // If the start cell has 0, then only we can reach to the cell
        if (obstacleGrid[0][0] == 0) {
            lookup[0][0] = 1;
        }
        // For the first column
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                lookup[i][0] = 0;
            } else {
                lookup[i][0] = lookup[i - 1][0];
            }
        }
        // For the first row
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                lookup[0][j] = 0;
            } else {
                lookup[0][j] = lookup[0][j - 1];
            }
        }
        // Populate the remaining table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // If the current cell is clear to move
                if (obstacleGrid[i][j] == 0) {
                    lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1];
                }
            }
        }
        return lookup[m - 1][n - 1];
    }
}
