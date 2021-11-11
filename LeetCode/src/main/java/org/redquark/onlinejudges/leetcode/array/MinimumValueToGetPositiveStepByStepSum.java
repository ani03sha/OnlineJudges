package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MinimumValueToGetPositiveStepByStepSum {

    public int minStartValue(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Minimum prefix sum
        int minPrefixSum = 0;
        // Cumulative sum
        int sum = 0;
        // Loop through all the elements
        for (int num : nums) {
            sum += num;
            minPrefixSum = Math.min(minPrefixSum, sum);
        }
        return 1 - minPrefixSum;
    }
}
