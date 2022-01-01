package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BurstBalloons {

    public int maxCoins(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Synthetic array to have left and right extremes
        int[] synthetic = new int[n + 2];
        // Store the values in original array in synthetic array
        synthetic[0] = synthetic[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                synthetic[i + 1] = nums[i];
            }
        }
        // Lookup table to store memoized data
        int[][] lookup = new int[n + 2][n + 2];
        return memoization(synthetic, 0, n + 1, lookup);
    }

    private int memoization(int[] synthetic, int left, int right, int[][] lookup) {
        // If left crosses right
        if (left > right) {
            return 0;
        }
        // If the value has already been calculated
        if (lookup[left][right] != 0) {
            return lookup[left][right];
        }
        // Variable to store value for current iteration
        int value = 0;
        for (int i = left + 1; i < right; i++) {
            value = Math.max(value, synthetic[left] * synthetic[i] * synthetic[right] + memoization(synthetic, left, i, lookup) + memoization(synthetic, i, right, lookup));
        }
        return lookup[left][right] = value;
    }
}
