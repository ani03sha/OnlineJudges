package org.redquark.onlinejudges.leetcode.bitmagic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        // List to store the power set
        List<List<Integer>> powerSet = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return powerSet;
        }
        // Size of the array
        int n = nums.length;
        // Size of the power set => 2 ^ n
        int powerSetSize = 1 << n;
        // Traverse from 0 to powerSetSize
        for (int i = 0; i < powerSetSize; i++) {
            // List to store the current subset
            List<Integer> subset = new ArrayList<>();
            // Loop through the bits of the current number
            for (int j = 0; j < n; j++) {
                // Add elements from those indices whose
                // corresponding bits are set
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            // Add this subset to power set list
            powerSet.add(subset);
        }
        return powerSet;
    }
}
