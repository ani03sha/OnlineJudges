package org.redquark.onlinejudges.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class LongestArithmeticSubsequenceOfGivenDifference {

    public int longestSubsequence(int[] arr, int difference) {
        // Special case
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // Lookup table to store the difference between the
        // current element and the given difference.
        // This will allow us to mark all the elements that
        // are valid for the subsequence
        Map<Integer, Integer> lookup = new HashMap<>();
        // Variable to store the longest length;
        int longestLength = 0;
        // Loop through the array
        for (int a : arr) {
            lookup.put(a, lookup.getOrDefault(a - difference, 0) + 1);
            longestLength = Math.max(longestLength, lookup.get(a));
        }
        return longestLength;
    }
}
