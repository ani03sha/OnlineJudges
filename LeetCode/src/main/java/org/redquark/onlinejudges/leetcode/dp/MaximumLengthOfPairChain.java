package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Anirudh Sharma
 */
public class MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        // Special case
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        // Sort the array by first value of pairs
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        // Length of the array
        int n = pairs.length;
        // Lookup table to store the maximum chain length
        // until that index
        int[] lookup = new int[n];
        // Since every pair is a valid chain pair of length 1
        Arrays.fill(lookup, 1);
        // Populate the table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Compare the two pairs' first and second values
                if (pairs[i][0] > pairs[j][1]) {
                    lookup[i] = Math.max(lookup[i], lookup[j] + 1);
                }
            }
        }
        // Find the maximum value stored in the lookup table
        int maxLength = Integer.MIN_VALUE;
        for (int l : lookup) {
            maxLength = Math.max(l, maxLength);
        }
        return maxLength;
    }
}
