package org.redquark.onlinejudges.workattech.dp;

public class MaximumPathSumInMatrix {

    public int findMaxPath(int[][] M) {
        // Special case
        if (M == null || M.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = M.length;
        int n = M[0].length;
        // Maximum path sum
        int maxSum = Integer.MIN_VALUE;
        // Loop through each cell
        for (int i = 1; i < m; i++) {
            maxSum = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                // For every cell except first and
                // last column
                if (j > 0 && j < n - 1) {
                    M[i][j] += Math.max(M[i - 1][j], Math.max(M[i - 1][j - 1], M[i - 1][j + 1]));
                }
                // For the first column
                else if (j == 0) {
                    M[i][j] += Math.max(M[i - 1][j], M[i - 1][j + 1]);
                }
                // For the last column
                else if (j == n - 1) {
                    M[i][j] += Math.max(M[i - 1][j], M[i - 1][j - 1]);
                }
                maxSum = Math.max(maxSum, M[i][j]);
            }
        }
        return maxSum;
    }
}
