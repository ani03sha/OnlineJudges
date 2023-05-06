package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {

    public int numSubseq(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Modulus
        final int MODULUS = 1_000_000_007;
        // Length of the array
        final int n = nums.length;
        // Sort the array
        Arrays.sort(nums);
        // Array to store the number of ways - we can either
        // pick or not pick the elements - so we will have
        // values as 2^(right - left)
        int[] powers = new int[n];
        powers[0] = 1;
        for (int i = 1; i < n; i++) {
            powers[i] = (powers[i - 1] * 2) % MODULUS;
        }
        // Total number of subsequences
        int count = 0;
        // Traverse through the array
        for (int left = 0; left < n; left++) {
            // Find the index of the maximum element
            int right = getMaximumValueIndex(nums, target - nums[left], n) - 1;
            // If the indices are valid
            if (left <= right) {
                count = (count + powers[right - left]) % MODULUS;
            }
        }
        return count;
    }

    private int getMaximumValueIndex(int[] nums, int value, int n) {
        // Perform binary search
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] <= value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
