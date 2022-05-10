package org.redquark.onlinejudges.leetcode.bitmagic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Subsets {

    public List<List<Integer>> subsetsWithBitManipulation(int[] nums) {
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

    public List<List<Integer>> subsetsWithBacktracking(int[] nums) {
        // List to store all the subsets
        List<List<Integer>> powerSet = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return powerSet;
        }
        // Sort the array
        Arrays.sort(nums);
        // At this point, we will perform backtracking
        backtrack(nums, powerSet, new ArrayList<>(), 0);
        return powerSet;
    }

    private void backtrack(int[] nums, List<List<Integer>> powerSet, List<Integer> current, int index) {
        // Add current list to the power set
        powerSet.add(new ArrayList<>(current));
        // Loop through all the numbers from the array
        for (int i = index; i < nums.length; i++) {
            // Choose the current element and add it to the list
            current.add(nums[i]);
            // Recurse for the next element in the array
            backtrack(nums, powerSet, current, i + 1);
            // Backtrack - remove the element added as a result of previous
            // step so that we can make the combination of nums[i] with
            // another element
            current.remove(current.size() - 1);
        }
    }
}
