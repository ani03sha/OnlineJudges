package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to store the sum and the ending index
        // in the array at which that sum was found
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // Maximum contiguous length with equal 0s and 1s in array
        int maxLength = 0;
        // Initial sum
        int sum = 0;
        // Store the sum 0 as well, which found at index -1 (assume)
        sumIndexMap.put(sum, -1);
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is zero, treat it as -1
            sum += nums[i] == 0 ? -1 : 1;
            // Check if this sum is present in the map
            if (sumIndexMap.containsKey(sum)) {
                // Update maxLength if required
                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
            }
            // Else store the mapping
            sumIndexMap.put(sum, i);
        }
        return maxLength;
    }
}
