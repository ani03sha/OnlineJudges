package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the pointers meet
        while (left < right) {
            // Middle index
            int middle = left + (right - left) / 2;
            // Check if mid is even or odd
            if ((middle % 2 == 0 && nums[middle] == nums[middle + 1])
                    || (middle % 2 == 1 && nums[middle - 1] == nums[middle])) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[left];
    }
}
