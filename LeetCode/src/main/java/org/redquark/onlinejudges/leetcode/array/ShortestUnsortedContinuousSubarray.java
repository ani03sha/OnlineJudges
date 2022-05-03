package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return 0;
        }
        // length of the array
        int n = nums.length;
        // Pointers to keep track of left and right boundaries
        // of the unsorted subarray
        int left = -1;
        int right = -1;
        // Variables to keep track of maximum and minimum in the
        // unsorted subarray
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // Loop through all the elements in the array
        for (int i = 0; i < n; i++) {
            // Update max and min if needed
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - i - 1]);
            // Update the boundary pointers
            if (nums[i] < max) {
                right = i;
            }
            if (nums[n - i - 1] > min) {
                left = n - i - 1;
            }
        }
        // Check if the array was already sorted
        if (left == -1) {
            return 0;
        }
        return right - left + 1;
    }
}
