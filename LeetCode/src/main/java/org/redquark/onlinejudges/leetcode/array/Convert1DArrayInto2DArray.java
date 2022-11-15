package org.redquark.onlinejudges.leetcode.array;

public class Convert1DArrayInto2DArray {

    /**
     * Time complexity - O(m*n)
     * Space complexity - O(1)
     */
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Special cases
        if (original == null || original.length == 0 || m * n != original.length) {
            return new int[][]{};
        }
        // Create a 2D array with given dimensions
        int[][] output = new int[m][n];
        // Index to keep track of the original array elements
        int index = 0;
        // Populate the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = original[index];
                index++;
            }
        }
        return output;
    }
}
