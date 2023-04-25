package org.redquark.onlinejudges.leetcode.array;

public class SortColors {

    public int[] sortColors(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Count of zeroes and ones
        int zeroes = 0;
        int ones = 0;
        // Traverse through the array
        for (int num : nums) {
            if (num == 0) {
                zeroes++;
            } else if (num == 1) {
                ones++;
            }
        }
        // Sort the array
        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }
        for (int i = zeroes; i < zeroes + ones; i++) {
            nums[i] = 1;
        }
        for (int i = zeroes + ones; i < nums.length; i++) {
            nums[i] = 2;
        }
        return nums;
    }
}
