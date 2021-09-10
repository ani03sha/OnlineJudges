package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        // Special case
        if (nums == null || nums.length < 3) {
            return 0;
        }
        // Total arithmetic slices in the array
        int globalCount = 0;
        // Consecutive arithmetic slices
        int localCount = 0;
        // Loop through the array element by element
        for (int i = 1; i < nums.length - 1; i++) {
            // Check if the current window is a part of arithmetic sequence or not
            if (nums[i] - nums[i - 1] == nums[i + 1] - nums[i]) {
                localCount++;
                globalCount += localCount;
            } else {
                // Reset count
                localCount = 0;
            }
        }
        return globalCount;
    }
}
