package org.redquark.onlinejudges.leetcode.array;

public class PeakIndexInAMountainArray {

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public int peakIndexInMountainArray(int[] nums) {
        // Special case
        if (nums == null || nums.length < 3) {
            return -1;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop until we find the pivot index
        while (left <= right) {
            // Get the middle index
            int middle = left + (right - left) / 2;
            // Compare the element in the middle with the elements to
            // its left and right
            if (middle > 0 && nums[middle] > nums[middle - 1]
                    && middle < n - 1 && nums[middle] > nums[middle + 1]) {
                return middle;
            } else if (middle > 0 && nums[middle] < nums[middle - 1]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
