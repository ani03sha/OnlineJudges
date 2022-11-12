package org.redquark.onlinejudges.leetcode.array;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Count of the islands
        int count = 0;
        // Traverse through the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // We need to check if the current cell is part
                // of an island only if it is a 1.
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    private int dfs(char[][] grid, int i, int j, int m, int n) {
        // Check if the indices are not out of bounds
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return 0;
        }
        // Mark this cell as visited
        grid[i][j] = '0';
        // Recursive calls to check for the neighbors
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
        // If we reach here it means, we have found an island
        return 1;
    }
}
