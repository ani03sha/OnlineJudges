package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

public class CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Lookup table to store the memoized results
        int[] lookup = new int[target + 1];
        // Fill this array with default values
        Arrays.fill(lookup, -1);
        // Recursively call the helper function
        combinationSum4Helper(nums, target, lookup);
        return lookup[target];
    }

    private int combinationSum4Helper(int[] nums, int target, int[] lookup) {
        // Check for base cases
        if (target == 0) {
            return 1;
        }
        // Check if this value has already been calculated
        if (lookup[target] != -1) {
            return lookup[target];
        }
        // Count for current target value
        int count = 0;
        // Loop through all the elements in the array
        for (int num : nums) {
            if (target >= num) {
                count += combinationSum4Helper(nums, target - num, lookup);
            }
        }
        // Cache the value
        lookup[target] = count;
        return count;
    }
}
