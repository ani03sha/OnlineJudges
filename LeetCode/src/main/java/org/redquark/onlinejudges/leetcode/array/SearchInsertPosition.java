package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Middle index of the current range
            int middle = left + (right - left) / 2;
            // If the target is found is at the middle index
            if (nums[middle] == target) {
                return middle;
            }
            // Check if the target is greater than the middle element
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            // Check if the target is smaller than the middle element
            else {
                right = middle - 1;
            }
        }
        return left;
    }
}
