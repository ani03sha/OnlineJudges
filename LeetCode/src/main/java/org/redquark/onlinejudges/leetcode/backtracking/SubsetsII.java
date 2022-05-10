package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // List to store the power set
        List<List<Integer>> powerSet = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return powerSet;
        }
        // Sort the array
        Arrays.sort(nums);
        // Perform backtracking
        backtrack(nums, powerSet, new ArrayList<>(), 0);
        return powerSet;
    }

    private void backtrack(int[] nums, List<List<Integer>> powerSet, List<Integer> current, int index) {
        // Add the current list to the power set
        powerSet.add(new ArrayList<>(current));
        // Loop through all the elements in the array
        for (int i = index; i < nums.length; i++) {
            // Skip the duplicates
            if (i > index && nums[i - 1] == nums[i]) {
                continue;
            }
            // Choose the current element
            current.add(nums[i]);
            // Recurse for the next index
            backtrack(nums, powerSet, current, i + 1);
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
