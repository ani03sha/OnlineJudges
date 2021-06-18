package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class RangeSumQueryImmutable {

    static class NumArray {

        // Array to store the cumulative sum of the
        // elements of the nums array
        private final int[] cumulativeSum;

        public NumArray(int[] nums) {
            // Length of the array
            int n = nums.length;
            this.cumulativeSum = new int[n];
            // Fill the array with cumulative sum
            cumulativeSum[0] = nums[0];
            for (int i = 1; i < n; i++) {
                cumulativeSum[i] = nums[i] + cumulativeSum[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            if (left > 0) {
                return cumulativeSum[right] - cumulativeSum[left - 1];
            } else {
                return cumulativeSum[right];
            }
        }
    }
}
