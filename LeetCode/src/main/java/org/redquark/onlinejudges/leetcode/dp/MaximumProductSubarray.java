package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Variable to keep track of the maximum product globally
        int globalMax = nums[0];
        // Variable to keep track of the maximum product until the
        // current index
        int localMax = nums[0];
        // Variable to keep track of the minimum product until the
        // current index
        int localMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Store the local maximum for local minimum calculation
            int temp = localMax;
            // Find the local maximum
            localMax = Math.max(nums[i], Math.max(localMax * nums[i], localMin * nums[i]));
            // Find the local minimum
            localMin = Math.min(nums[i], Math.min(temp * nums[i], localMin * nums[i]));
            // Update global maximum if required
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
