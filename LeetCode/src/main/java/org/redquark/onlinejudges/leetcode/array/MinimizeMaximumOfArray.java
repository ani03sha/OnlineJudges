package org.redquark.onlinejudges.leetcode.array;

public class MinimizeMaximumOfArray {

    public int minimizeArrayValue(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Variable to store the minimum maximum element
        long minMax = 0;
        // Variable to store the prefix sum
        long prefixSum = 0;
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            minMax = Math.max(minMax, (prefixSum + i) / (i + 1));
        }
        return (int) minMax;
    }
}
