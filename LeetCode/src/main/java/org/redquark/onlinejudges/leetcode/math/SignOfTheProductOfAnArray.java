package org.redquark.onlinejudges.leetcode.math;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null/empty!");
        }
        // Count of negative numbers in the array
        int count = 0;
        // Traverse through the array
        for (int num : nums) {
            if (num < 0) {
                count++;
            }
            if (num == 0) {
                return 0;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
