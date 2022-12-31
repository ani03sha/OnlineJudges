package org.redquark.onlinejudges.workattech.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int getLengthOfLIS(int[] A) {
        // Special case
        if (A == null || A.length == 0) {
            return 0;
        }
        // Length of the array
        int n = A.length;
        // Lookup table to store the LIS until
        // that index
        int[] lookup = new int[n];
        // Since every character is na LIS of
        // length 1
        Arrays.fill(lookup, 1);
        // Loop through the string
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    lookup[i] = Math.max(lookup[i], 1 + lookup[j]);
                }
            }
        }
        // Find the maximum length among all the
        // LIS lengths
        int longestLength = 0;
        for (int length : lookup) {
            longestLength = Math.max(longestLength, length);
        }
        return longestLength;
    }
}
