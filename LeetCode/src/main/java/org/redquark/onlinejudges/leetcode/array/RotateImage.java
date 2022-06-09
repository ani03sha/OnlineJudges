package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class RotateImage {

    public int[][] rotate(int[][] matrix) {
        // Special cases
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Order of the matrix
        int N = matrix.length;
        // Traverse the matrix
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                // SWap elements of each cycle in clockwise order
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][i];
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
                matrix[j][N - 1 - i] = temp;
            }
        }
        return matrix;
    }
}
