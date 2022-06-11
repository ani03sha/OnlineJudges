package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // List to store the output
        List<Integer> output = new ArrayList<>();
        // Special case
        if (matrix == null || matrix.length == 0) {
            return output;
        }
        // Dimensions of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Indices for traversing in four directions
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        // Loop until size of the list becomes equal to the
        // total number of elements in the matrix
        while (left <= right && top <= bottom) {
            // Move from left to right
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }
            top++;
            // Move from top to bottom
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;
            // Check if we have reached out of bounds
            if (left > right || top > bottom) {
                break;
            }
            // Move from right to left
            for (int i = right; i >= left; i--) {
                output.add(matrix[bottom][i]);
            }
            bottom--;
            // Move from bottom to top
            for (int i = bottom; i >= top; i--) {
                output.add(matrix[i][left]);
            }
            left++;
        }
        return output;
    }
}
