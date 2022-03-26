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
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle index of the range
            int middle = left + (right - left) / 2;
            // If the element at the middle index is
            // the target value, we have found it
            if (nums[middle] == target) {
                return middle;
            }
            // If the target is smaller than the element
            // at the middle index, we search in left half
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            // If the target is greater than the element
            // at the middle index, we search in right half
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
