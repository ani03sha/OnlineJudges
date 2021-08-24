package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Count of the subarrays
        int count = 0;
        // Map to store the cumulative sum and their
        // respective frequencies
        Map<Integer, Integer> cumulativeSumMap = new HashMap<>();
        // Cumulative Sum
        int cumulativeSum = 0;
        // Add this to the map
        cumulativeSumMap.put(cumulativeSum, 1);
        // Loop for all the elements in the array
        for (int num : nums) {
            cumulativeSum += num;
            // Check if we have seen the difference of this cumulative
            // sum and the target k
            if (cumulativeSumMap.containsKey(cumulativeSum - k)) {
                count += cumulativeSumMap.get(cumulativeSum - k);
            }
            cumulativeSumMap.put(cumulativeSum, cumulativeSumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;
    }
}
