package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // This variable will store the maximum sum
        // in a subarray
        int globalMax = nums[0];
        // This variable will store the maximum sum
        // until that index
        int localMax = nums[0];
        // Loop through every other element in the array
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
