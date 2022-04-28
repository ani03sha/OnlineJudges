package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class PathWithMinimumEffort {

    public int minimumEffortPath(int[][] heights) {
        // Special case
        if (heights == null || heights.length == 0) {
            throw new IllegalArgumentException("Heights array cannot be null or empty");
        }
        // Dimensions of the grid
        int m = heights.length;
        int n = heights[0].length;
        // Variable to keep track of the minimum effort path
        int minimumEffort = Integer.MAX_VALUE;
        // Start and end pointers for binary search
        int start = 0;
        int end = Integer.MAX_VALUE;
        // Perform binary search
        while (start <= end) {
            // Calculate mid
            int middle = start + (end - start) / 2;
            // Boolean array for visited cells
            boolean[][] visited = new boolean[100][100];
            // Check paths for this value of DFS
            if (dfs(0, 0, middle, m, n, heights, visited)) {
                minimumEffort = Math.min(minimumEffort, middle);
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return minimumEffort;
    }

    private boolean dfs(int i, int j, int maximumPermissibleDifference, int m, int n, int[][] heights, boolean[][] visited) {
        // If we have reached the last cell
        if (i == m - 1 && j == n - 1) {
            return true;
        }
        // Mark the current cell as visited
        visited[i][j] = true;
        // Flag to check if the current path is an option
        boolean viableOption = false;
        // Perform DFS in all the four directions
        if (i > 0 && !visited[i - 1][j] && Math.abs(heights[i][j] - heights[i - 1][j]) <= maximumPermissibleDifference) {
            viableOption = viableOption || dfs(i - 1, j, maximumPermissibleDifference, m, n, heights, visited);
        }
        if (i < m - 1 && !visited[i + 1][j] && Math.abs(heights[i][j] - heights[i + 1][j]) <= maximumPermissibleDifference) {
            viableOption = viableOption || dfs(i + 1, j, maximumPermissibleDifference, m, n, heights, visited);
        }
        if (j > 0 && !visited[i][j - 1] && Math.abs(heights[i][j] - heights[i][j - 1]) <= maximumPermissibleDifference) {
            viableOption = viableOption || dfs(i, j - 1, maximumPermissibleDifference, m, n, heights, visited);
        }
        if (j < n - 1 && !visited[i][j + 1] && Math.abs(heights[i][j] - heights[i][j + 1]) <= maximumPermissibleDifference) {
            viableOption = viableOption || dfs(i, j + 1, maximumPermissibleDifference, m, n, heights, visited);
        }
        return viableOption;
    }
}
