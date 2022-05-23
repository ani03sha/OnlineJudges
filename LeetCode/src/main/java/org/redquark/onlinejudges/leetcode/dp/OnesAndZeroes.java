package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class OnesAndZeroes {

    public int findMaxFormWithRecursion(String[] strs, int m, int n) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Total number of binary strings
        int length = strs.length;
        // Array to store the count of zeroes and ones in every string
        int[][] zeroesAndOnesCounts = new int[length][2];
        // Populate this array
        for (int i = 0; i < length; i++) {
            int ones = 0;
            int zeroes = 0;
            for (char c : strs[i].toCharArray()) {
                if (c == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
            }
            zeroesAndOnesCounts[i] = new int[]{zeroes, ones};
        }
        // Solve recursively
        return findMaxFormWithRecursion(zeroesAndOnesCounts, 0, m, n);
    }

    private int findMaxFormWithRecursion(int[][] zeroesAndOnesCounts, int index, int zeroesLeft, int onesLeft) {
        // Base case - if we have reached the end of the array, or
        // we don't have any options left to explore
        if (index == zeroesAndOnesCounts.length || (zeroesLeft == 0 && onesLeft == 0)) {
            return 0;
        }
        // If the current string has greater number of zeroes and ones that
        // are required, so we cannot take this string
        if (zeroesLeft < zeroesAndOnesCounts[index][0] || onesLeft < zeroesAndOnesCounts[index][1]) {
            return findMaxFormWithRecursion(
                    zeroesAndOnesCounts,
                    index + 1,
                    zeroesLeft,
                    onesLeft
            );
        }
        // At this point, we have two options - include or exclude the current string
        int include = 1 + findMaxFormWithRecursion(
                zeroesAndOnesCounts,
                index + 1,
                zeroesLeft - zeroesAndOnesCounts[index][0],
                onesLeft - zeroesAndOnesCounts[index][1]
        );
        int exclude = findMaxFormWithRecursion(
                zeroesAndOnesCounts,
                index + 1,
                zeroesLeft,
                onesLeft
        );
        return Math.max(include, exclude);
    }

    public int findMaxFormWithMemoization(String[] strs, int m, int n) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Total number of binary strings
        int length = strs.length;
        // Array to store the count of zeroes and ones in every string
        int[][] zeroesAndOnesCounts = new int[length][2];
        // Populate this array
        for (int i = 0; i < length; i++) {
            int ones = 0;
            int zeroes = 0;
            for (char c : strs[i].toCharArray()) {
                if (c == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
            }
            zeroesAndOnesCounts[i] = new int[]{zeroes, ones};
        }
        // Solve with memoization
        int[][][] lookup = new int[length + 1][m + 1][n + 1];
        // Fill the array with default values
        Arrays.stream(lookup).forEach(a -> Arrays.stream(a).forEach(b -> Arrays.fill(b, -1)));
        return findMaxFormWithMemoization(zeroesAndOnesCounts, 0, m, n, lookup);
    }

    private int findMaxFormWithMemoization(int[][] zeroesAndOnesCounts, int index, int zeroesLeft, int onesLeft, int[][][] lookup) {
        // Base case - if we have reached the end of the array, or
        // we don't have any options left to explore
        if (index == zeroesAndOnesCounts.length || (zeroesLeft == 0 && onesLeft == 0)) {
            return 0;
        }
        // If the solution of this sub-problem is already found, then we will
        // return that solution
        if (lookup[index][zeroesLeft][onesLeft] != -1) {
            return lookup[index][zeroesLeft][onesLeft];
        }
        // If the current string has greater number of zeroes and ones that
        // are required, so we cannot take this string
        if (zeroesLeft < zeroesAndOnesCounts[index][0] || onesLeft < zeroesAndOnesCounts[index][1]) {
            return lookup[index][zeroesLeft][onesLeft] = findMaxFormWithMemoization(
                    zeroesAndOnesCounts,
                    index + 1,
                    zeroesLeft,
                    onesLeft,
                    lookup
            );
        }
        // At this point, we have two options - include or exclude the current string
        int include = 1 + findMaxFormWithMemoization(
                zeroesAndOnesCounts,
                index + 1,
                zeroesLeft - zeroesAndOnesCounts[index][0],
                onesLeft - zeroesAndOnesCounts[index][1],
                lookup
        );
        int exclude = findMaxFormWithMemoization(
                zeroesAndOnesCounts,
                index + 1,
                zeroesLeft,
                onesLeft,
                lookup
        );
        return lookup[index][zeroesLeft][onesLeft] = Math.max(include, exclude);
    }

    public int findMaxFormWithDP(String[] strs, int m, int n) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Lookup table to store length of the largest subset
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