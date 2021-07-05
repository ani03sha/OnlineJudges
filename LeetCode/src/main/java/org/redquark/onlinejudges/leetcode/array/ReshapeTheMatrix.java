package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] matrix, int r, int c) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Check for legality
        if (m * n != r * c) {
            return matrix;
        }
        int[][] reshapedMatrix = new int[r][c];
        // Indices for row and column
        int row = 0;
        int column = 0;
        // Populate this matrix
        for (int[] currentRow : matrix) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][column] = currentRow[j];
                column++;
                // If we have reached to the end of the row
                if (column == c) {
                    // Update the column and row indices
                    column = 0;
                    row++;
                }
            }
        }
        return reshapedMatrix;
    }
}
