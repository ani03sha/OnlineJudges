package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class UniquePathsIII {

    public int uniquePathsIII(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = grid.length;
        int n = grid[0].length;
        // Starting coordinates
        int x = -1;
        int y = -1;
        // Count of valid cells in the grid which will be equal
        // to the number of zeroes in the grid
        int validCells = 0;
        // Loop over the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell is valid cell, then update
                // the count of valid cells
                if (grid[i][j] == 0) {
                    validCells++;
                }
                // If the current cell is the starting point, update
                // the starting coordinates
                else if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        return dfs(grid, x, y, m, n, validCells);
    }

    private int dfs(int[][] grid, int x, int y, int m, int n, int validCells) {
        // Base case
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1) {
            return 0;
        }
        // If we have reached to the ending point
        if (grid[x][y] == 2) {
            return validCells == -1 ? 1 : 0;
        }
        // Mark the current cell as visited
        grid[x][y] = -1;
        // Decrement the count of valid cells
        validCells--;
        // Total paths in all four directions
        int totalPaths = dfs(grid, x - 1, y, m, n, validCells)
                + dfs(grid, x + 1, y, m, n, validCells)
                + dfs(grid, x, y - 1, m, n, validCells)
                + dfs(grid, x, y + 1, m, n, validCells);
        // If we are not able to find the path, we backtrack
        grid[x][y] = 0;
        return totalPaths;
    }
}
