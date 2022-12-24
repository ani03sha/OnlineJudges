package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {

    /**
     * Time complexity - O(n ^ 2)
     * Space complexity - O(n)
     */
    public int findNumberOfLIS(int[] nums) {
        // Base condition
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // This array will store the lengths of LIS ending at the current index;
        int[] lengths = new int[n];
        // By default, the longest increasing sequence is the element itself of
        // length 1.
        Arrays.fill(lengths, 1);
        // While tracking, we will realize that at times there is more than one set
        // of preceding items in nums that can make the longest increasing subsequence
        // that end at the index we are currently processing.
        // The best way to track this is in a separate array called frequency. Each element
        // will here is initialized to 1. This signifies that initially, there can only be a
        // single longest subsequence ending at any index.
        int[] counts = new int[n];
        Arrays.fill(counts, 1);
        // Process the elements in the array from left to right and skipping the first
        // element because there cannot be any LIS ending at first element longer than 1.
        for (int i = 1; i < n; i++) {
            // Compare the current element with every element before it
            for (int j = 0; j < i; j++) {
                // If the sequence is strictly increasing
                if (nums[i] > nums[j]) {
                    // If including the element at the index 'i' to the subsequence ending
                    // at the index 'j' makes a subsequence larger than any other subsequence
                    // ending at 'i'
                    if (lengths[j] + 1 > lengths[i]) {
                        // LIS will be updated for the index 'i'.
                        lengths[i] = lengths[j] + 1;
                        // The new longest subsequence length is created by any and every path
                        // that could have ended at the j-th index. Hence, we set i's frequency
                        // same as j.
                        counts[i] = counts[j];
                    }
                    // If we already have found a 'j' that helps make a LIS ending at 'i'
                    else if (lengths[j] + 1 == lengths[i]) {
                        // Add frequency of all longest subsequences that end at j to our
                        // counts array for 'i'.
                        counts[i] += counts[j];
                    }
                }
            }
        }
        // Find the LIS length
        int maxLength = 1;
        for (int length : lengths) {
            maxLength = Math.max(maxLength, length);
        }
        // Find the count of the LISes which have the
        // length equal to the maxLength
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (maxLength == lengths[i]) {
                result += counts[i];
            }
        }
        return result;
    }
}
