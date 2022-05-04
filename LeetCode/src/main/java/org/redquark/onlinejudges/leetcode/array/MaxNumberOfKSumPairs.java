package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class MaxNumberOfKSumPairs {

    public int maxOperations(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Variable to keep track of total number of pairs
        int pairs = 0;
        // Map to store the frequencies of elements which are
        // less than k
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Loop through the array of
        for (int n : nums) {
            if (n < k) {
                frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
            }
        }
        // Loop through the map to count the pairs
        for (int key : frequencies.keySet()) {
            pairs += Math.min(frequencies.getOrDefault(key, 0), frequencies.getOrDefault(k - key, 0));
        }
        return pairs / 2;
    }
}
