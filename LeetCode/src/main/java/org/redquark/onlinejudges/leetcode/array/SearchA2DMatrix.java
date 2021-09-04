package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        // Rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Indices for rows and columns
        int i = 0;
        // Loop row wise
        while (i < rows) {
            if (matrix[i][0] <= target && matrix[i][columns - 1] >= target) {
                // Perform binary search in the current row
                return binarySearch(matrix, i, columns, target);
            }
            i++;
        }
        return false;
    }

    private boolean binarySearch(int[][] matrix, int row, int column, int target) {
        // Start and end pointers
        int start = 0;
        int end = column - 1;
        // Loop until two pointers meet
        while (start <= end) {
            // Middle index
            int middle = start + (end - start) / 2;
            if (matrix[row][middle] == target) {
                return true;
            } else if (matrix[row][middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
