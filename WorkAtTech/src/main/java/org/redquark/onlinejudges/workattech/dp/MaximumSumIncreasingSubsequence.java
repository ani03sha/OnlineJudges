package org.redquark.onlinejudges.workattech.dp;

public class MaximumSumIncreasingSubsequence {

    public int maxSumSubsequence(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Lookup table to store the maximum sum
        // in a increasing sequency ending at the
        // current index
        int[] lookup = new int[n];
        // Since every number is itself a valid
        // subsequence of length 1
        System.arraycopy(nums, 0, lookup, 0, n);
        // Loop through the remaining array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lookup[i] = Math.max(lookup[j] + nums[i], lookup[i]);
                }
            }
        }
        // Find the maximum sum
        int maxSum = 0;
        for (int element : lookup) {
            maxSum = Math.max(maxSum, element);
        }
        return maxSum;
    }
}
