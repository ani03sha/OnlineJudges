package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class RangeSumQuery2DImmutable {

    static class NumMatrix {

        // Table to store the sum of each sub-matrix
        private final int[][] lookup;

        public NumMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            lookup = new int[m + 1][n + 1];
            // Fill up this lookup table
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    lookup[i][j] = lookup[i - 1][j] + lookup[i][j - 1] + matrix[i - 1][j - 1] - lookup[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            // Since we will be looking up in the lookup table,
            // we will increment row and columns by 1
            row1++;
            col1++;
            row2++;
            col2++;
            return lookup[row2][col2] - lookup[row1 - 1][col2] - lookup[row2][col1 - 1] + lookup[row1 - 1][col1 - 1];
        }
    }
}
