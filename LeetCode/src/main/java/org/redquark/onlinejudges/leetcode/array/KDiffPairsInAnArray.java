package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class KDiffPairsInAnArray {

    public int findPairs(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to store the frequencies of elements in the array
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Populate the map
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        // Counter for valid pairs in the array
        int count = 0;
        // Loop through the map
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            // For k != 0, we will check if k + entry.getKey exists or
            // for k == 0, check if entry.getValue > 1
            if ((k != 0 && frequencies.containsKey(k + entry.getKey()))
                    || (k == 0 && entry.getValue() > 1)) {
                count++;
            }
        }
        return count;
    }
}
