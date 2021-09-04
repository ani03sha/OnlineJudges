package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Flag to check if there is any positive value
        boolean anyPositive = false;
        // Handle the case where all elements are negative
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= 0) {
                anyPositive = true;
                break;
            }
            max = Math.max(max, num);
        }
        if (!anyPositive) {
            return max;
        }
        // Find sum of all elements of subarray
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        // Find maximum sum subarray
        int maximumSum = kadane(nums);
        // Find minimum sum subarray. For that we
        // will negate all elements in the subarray
        // and will find out the max sum
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
        int minimumSum = kadane(nums);
        return Math.max(maximumSum, totalSum + minimumSum);
    }

    private int kadane(int[] nums) {
        // Speical case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Global max - maximum sum subarray
        int globalMax = nums[0];
        // Local max - maximum sum for the current subarray
        int localMax = nums[0];
        // Loop for all the elements
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
