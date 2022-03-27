package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        // Special case
        if (mat == null || mat.length == 0) {
            return new int[]{};
        }
        // Array to store the results
        int[] result = new int[k];
        // Array to store the sum of the elements of the row
        // and the index of the row
        int[][] sums = new int[mat.length][2];
        // Loop through the matrix and store the sum of each
        // row along with its index
        for (int i = 0; i < mat.length; i++) {
            sums[i][0] = i;
            // Sum of all elements in the i-th row
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            sums[i][1] = sum;
        }
        // Sort the array based on sum of row elements
        Arrays.sort(sums, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        // Update the results array
        for (int i = 0; i < k; i++) {
            result[i] = sums[i][0];
        }
        return result;
    }
}
