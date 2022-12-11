package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

    /**
     * Time complexity - O(log(n) + k)
     * Space complexity - O(1)
     */
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        // List to store the closest elements
        List<Integer> closestElements = new ArrayList<>();
        // Special case
        if (nums == null || nums.length < k) {
            return closestElements;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - k;
        // Loop until we find the k-closest elements
        while (left < right) {
            // Get the middle index
            int middle = left + (right - left) / 2;
            // Check the range for k elements
            if (x - nums[middle] > nums[middle + k] - x) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        // Add the elements k elements from the left index to the list
        for (int i = 0; i < k; i++) {
            closestElements.add(nums[i + left]);
        }
        return closestElements;
    }
}
