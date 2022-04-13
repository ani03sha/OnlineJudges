package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        // Matrix to store the result
        int[][] matrix = new int[n][n];
        // Variable to keep track of the counter from 1 to n * n
        int counter = 1;
        // Top, bottom, left and right pointers
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        // Loop until counter reaches n * n
        while (counter <= n * n) {
            // Direction - left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = counter;
                counter++;
            }
            top++;
            // Direction - top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = counter;
                counter++;
            }
            right--;
            // Direction - right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = counter;
                counter++;
            }
            bottom--;
            // Direction - bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = counter;
                counter++;
            }
            left++;
        }
        return matrix;
    }
}
