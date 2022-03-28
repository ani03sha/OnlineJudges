package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop through the array until two pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // If the element at the middle index is equal to
            // the target value
            if (nums[middle] == target) {
                return true;
            }
            // If the left half is correctly sorted, i.e.,
            // pivot is not present in the left half
            else if (nums[left] < nums[middle]) {
                // If the number lies in the left half
                if (nums[left] <= target && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            // If the left half is not correctly sorted, i.e.,
            // pivot is present in the right half
            else if (nums[left] > nums[middle]) {
                // If the number lies in the right half
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
            // Move the left pointer ahead
            else {
                left++;
            }
        }
        return false;
    }
}
