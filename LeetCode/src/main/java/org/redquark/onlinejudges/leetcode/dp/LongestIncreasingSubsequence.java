package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Lookup table to store the length of LIS until the
        // current index
        int[] lookup = new int[n];
        // Since every element is an LIS of length 1
        Arrays.fill(lookup, 1);
        // Loop through the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If the number at i is greater than the number
                // at j, then we will update the max, if requires
                if (nums[i] > nums[j]) {
                    lookup[i] = Math.max(lookup[i], lookup[j] + 1);
                }
            }
        }
        // Find the maximum element from the lookup table
        int longestLength = 0;
        for (int element : lookup) {
            longestLength = Math.max(longestLength, element);
        }
        return longestLength;
    }
}
