package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }
        // Order of the matrix
        int n = matrix.length;
        // We will start from the second last row and move up
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                // Current value of the matrix
                int current = matrix[i + 1][j];
                // Check with the left value
                if (j > 0) {
                    current = Math.min(current, matrix[i + 1][j - 1]);
                }
                // Check with the right value
                if (j < n - 1) {
                    current = Math.min(current, matrix[i + 1][j + 1]);
                }
                matrix[i][j] += current;
            }
        }
        // Variable to store the minimum value
        int minValue = Integer.MAX_VALUE;
        // Iterate through the first row and grab the minimum value
        for (int i = 0; i < n; i++) {
            minValue = Math.min(minValue, matrix[0][i]);
        }
        return minValue;
    }
}
