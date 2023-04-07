package org.redquark.onlinejudges.leetcode.array;

public class NumberOfEnclaves {

    public int numEnclaves(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Traverse for boundaries
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    dfs(grid, i, j, m, n);
                }
            }
        }
        // Total number of enclaves
        int enclaves = 0;
        // Traverse the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    enclaves++;
                }
            }
        }
        return enclaves;
    }

    private void dfs(int[][] grid, int i, int j, int m, int n) {
        if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
            grid[i][j] = 0;
            dfs(grid, i + 1, j, m, n);
            dfs(grid, i - 1, j, m, n);
            dfs(grid, i, j + 1, m, n);
            dfs(grid, i, j - 1, m, n);
        }
    }
}
