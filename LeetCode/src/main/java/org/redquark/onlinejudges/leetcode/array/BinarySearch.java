package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if the target is at middle index
            if (nums[middle] == target) {
                return middle;
            }
            // Check if the target lies in the right half
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            // Check if the target lies in the left half
            else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
