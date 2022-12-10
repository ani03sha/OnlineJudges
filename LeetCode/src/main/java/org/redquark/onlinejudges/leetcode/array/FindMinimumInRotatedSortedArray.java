package org.redquark.onlinejudges.leetcode.array;

public class FindMinimumInRotatedSortedArray {

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public int findMin(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // If the array is sorted 0 or n times.
        if (nums[0] < nums[n - 1]) {
            return nums[0];
        }
        // Loop until we find the smallest element
        while (right - left > 1) {
            // Find the middle index
            int middle = left + (right - left) / 2;
            if (nums[left] > nums[middle]) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return nums[right];
    }
}
