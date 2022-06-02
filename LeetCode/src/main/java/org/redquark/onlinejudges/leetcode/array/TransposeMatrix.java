package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Transposed matrix
        int[][] transposed = new int[columns][rows];
        // Loop through the original matrix and populate
        // the transposed matrix
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
