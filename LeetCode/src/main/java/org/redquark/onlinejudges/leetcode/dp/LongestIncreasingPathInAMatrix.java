package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class LongestIncreasingPathInAMatrix {

    public int longestIncreasingPath(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Directions
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        // Lookup array to store the longest lengths for each cell
        int[][] lookup = new int[m][n];
        // Length of the longest increasing path
        int longestPath = 0;
        // Loop over the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                longestPath = Math.max(longestPath, dfs(matrix, m, n, i, j, lookup, directions));
            }
        }
        return longestPath;
    }

    private int dfs(int[][] matrix, int m, int n, int i, int j, int[][] lookup, int[][] directions) {
        if (lookup[i][j] != 0) {
            return lookup[i][j];
        }
        // Maximum length at current point
        int currentLongestLength = 0;
        // Loop in all four directions
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            // Check for neighbors
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                currentLongestLength = Math.max(currentLongestLength, dfs(matrix, m, n, x, y, lookup, directions));
            }
        }
        return lookup[i][j] = 1 + currentLongestLength;
    }
}
