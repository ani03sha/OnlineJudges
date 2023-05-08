package org.redquark.onlinejudges.leetcode.array;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        // Order of the matrix
        int n = matrix.length;
        // Total sum of the diagonal elements
        int totalSum = 0;
        // For the primary diagnoal elements
        for (int i = 0; i < n; i++) {
            totalSum += matrix[i][i];
        }
        // For the secondary diagonal
        for (int i = n - 1; i >= 0; i--) {
            totalSum += matrix[n - i - 1][i];
        }
        // Compensate the common element in the center of
        // the matrix with odd order
        if (n % 2 == 1) {
            totalSum -= matrix[n / 2][n / 2];
        }
        return totalSum;
    }
}
