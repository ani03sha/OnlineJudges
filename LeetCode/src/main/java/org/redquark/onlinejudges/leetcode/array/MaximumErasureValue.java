package org.redquark.onlinejudges.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Set to store the unique elements
        Set<Integer> uniques = new HashSet<>();
        // Value to keep track of maximum sum for a subarray containing
        // unique elements
        int sum = 0;
        // Variable to store the maximum sum of a subarray
        int maxSum = 0;
        // Left and right pointers for sliding window
        int left = 0;
        int right = 0;
        // Loop through the array
        while (right < nums.length) {
            // If the current elements is not in the set already, we
            // should add it there
            if (uniques.add(nums[right])) {
                sum += nums[right];
                // Update the max sum, if required
                maxSum = Math.max(sum, maxSum);
                right++;
            }
            // If the current element in the set, we should move
            // our sliding window further
            else {
                sum -= nums[left];
                uniques.remove(nums[left]);
                left++;
            }
        }
        return maxSum;
    }
}
