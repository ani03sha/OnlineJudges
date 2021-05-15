package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Lookup table to store lenght of largest subset
        // for a certain combination of 0 and 1
        int[][] lookup = new int[m + 1][n + 1];
        // Traverse for every string present in the array
        for (String s : strs) {
            // Count of zeroes and ones
            int zeroes = 0;
            int ones = 0;
            // Get the count of zeroes and ones in the current string
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
            }
            // Now populate the lookup table with the available
            // zeroes and ones
            for (int i = m; i >= zeroes; i--) {
                for (int j = n; j >= ones; j--) {
                    lookup[i][j] = Math.max(lookup[i][j], lookup[i - zeroes][j - ones] + 1);
                }
            }
        }
        return lookup[m][n];
    }
}
