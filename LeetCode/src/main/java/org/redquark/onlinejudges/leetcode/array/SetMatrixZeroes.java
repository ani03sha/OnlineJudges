package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SetMatrixZeroes {

    public int[][] setZeroesSolutionOne(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Arrays to record the positions of 0s in rows and columns
        boolean[] row = new boolean[rows];
        boolean[] column = new boolean[columns];
        // Loop through the matrix and set the positions where 0 is found
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        // Again loop through the matrix and update the cells with 0, if required
        for (int i = 0; i < rows; i++) {
            if (row[i]) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < columns; j++) {
            if (column[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public int[][] setZeroesSolutionTwo(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Variables to represent first row and first column
        boolean firstRow = false;
        boolean firstColumn = false;
        // Loop through the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // If the current cell is zero
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstRow = true;
                    }
                    if (j == 0) {
                        firstColumn = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // Traverse for everything except the first row and column
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // If the first row is true
        if (firstRow) {
            for (int j = 0; j < columns; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColumn) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
}
