package org.redquark.onlinejudges.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to represent the lookup table
        Map<String, Integer> lookup = new HashMap<>();
        // Evaluate the expression
        return evaluate(nums, target, 0, lookup);
    }

    private int evaluate(int[] nums, int target, int index, Map<String, Integer> lookup) {
        // Base case
        if (index >= nums.length) {
            return target == 0 ? 1 : 0;
        }
        // Create the key for the map
        String key = index + "-" + target;
        // Check if this key is already present in the map
        // i.e., the result is already calculated
        if (lookup.containsKey(key)) {
            return lookup.get(key);
        }
        // Recurse for the positive and negative signs
        int ways = evaluate(nums, target - nums[index], index + 1, lookup) + evaluate(nums, target + nums[index], index + 1, lookup);
        // Add this result to the lookup table
        lookup.put(key, ways);
        return lookup.get(key);
    }
}
