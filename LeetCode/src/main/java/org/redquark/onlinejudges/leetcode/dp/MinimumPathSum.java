package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Rows and columns of the grid
        int m = grid.length;
        int n = grid[0].length;
        // If we are in the first row, we can move only horizontally
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }
        // If we are in the second row, we can move only vertically
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        // Populate for the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // We will choose the path with minimum cost
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
