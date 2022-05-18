package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the permutation based output
        int[] output = new int[n];
        // Populate the array
        for (int i = 0; i < n; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
}
