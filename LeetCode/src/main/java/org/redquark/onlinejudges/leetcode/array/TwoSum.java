package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Array to store the indices
        int[] indices = {-1, -1};
        // Special case
        if (nums == null || nums.length == 0) {
            return indices;
        }
        // Map to store the difference and the corresponding index
        Map<Integer, Integer> differenceMap = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            // Check if the difference already exists
            if (differenceMap.containsKey(difference)) {
                // Add the indices in the output array
                indices[0] = differenceMap.get(difference);
                indices[1] = i;
                break;
            }
            differenceMap.put(nums[i], i);
        }
        return indices;
    }
}
