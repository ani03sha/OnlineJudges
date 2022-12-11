package org.redquark.onlinejudges.leetcode.array;

public class SearchA2DMatrixII {

    /**
     * Time complexity - O(m + n)
     * Space complexity - O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        // Pointers to traverse through the matrix
        int row = 0;
        int column = matrix[0].length - 1;
        // Loop until we are not out of bounds
        while (row < matrix.length && column >= 0) {
            // Check if the last element of the row is less than
            // the target element
            if (target > matrix[row][column]) {
                // Since all the elements in the rows are sorted,
                // our target cannot lie in the current row
                row++;
            }
            // If the last element of the row is greater than the
            // target, then we may have target in the current row
            else if (target < matrix[row][column]) {
                // We will move inward to find the element i.e. we
                // discard the current column
                column--;
            } else {
                return true;
            }
        }
        return false;
    }
}
