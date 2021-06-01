package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        // Special cases
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Rows and columns of the grid
        int rows = grid.length;
        int columns = grid[0].length;
        // Maximum area
        int maxArea = 0;
        // Loop through the grid and call DFS on its
        // neighbors as soon as we encounter 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Check if the current element is 1
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, rows, columns, i, j));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int rows, int columns, int i, int j) {
        // Check for inbounds
        if (i < 0 || i >= rows || j < 0 || j >= columns || grid[i][j] == 0) {
            return 0;
        }
        // Since we have encountered the current cell, we will
        // mark it as 0 so that we don't traverse it again.
        grid[i][j] = 0;
        // Count of islands
        int islands = 1;
        // Call DFS recursively to check for neighbors
        islands += dfs(grid, rows, columns, i - 1, j);
        islands += dfs(grid, rows, columns, i + 1, j);
        islands += dfs(grid, rows, columns, i, j - 1);
        islands += dfs(grid, rows, columns, i, j + 1);
        return islands;
    }
}
