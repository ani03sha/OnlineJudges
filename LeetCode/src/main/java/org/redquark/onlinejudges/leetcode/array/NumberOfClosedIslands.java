package org.redquark.onlinejudges.leetcode.array;

public class NumberOfClosedIslands {

    public int closedIsland(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Array to mark visited cells
        boolean[][] visited = new boolean[m][n];
        // Total number of closed islands
        int closedIslands = 0;
        // Loop through the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !visited[i][j] && isClosed(grid, visited, i, j, m, n)) {
                    closedIslands++;
                }
            }
        }
        return closedIslands;
    }

    private boolean isClosed(int[][] grid, boolean[][] visited, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        visited[i][j] = true;
        boolean w = isClosed(grid, visited, i + 1, j, m, n);
        boolean x = isClosed(grid, visited, i - 1, j, m, n);
        boolean y = isClosed(grid, visited, i, j + 1, m, n);
        boolean z = isClosed(grid, visited, i, j - 1, m, n);
        return w && x && y && z;
    }
}
