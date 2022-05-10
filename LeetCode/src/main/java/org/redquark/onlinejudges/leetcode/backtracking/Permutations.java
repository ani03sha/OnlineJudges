package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // List to store all the permutations
        List<List<Integer>> permutations = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return permutations;
        }
        // Perform backtracking algorithm from the start index
        backtrack(nums, permutations, new ArrayList<>());
        return permutations;
    }

    private void backtrack(int[] nums, List<List<Integer>> permutations, List<Integer> current) {
        if (nums.length == current.size()) {
            // Add the current list to the permutations
            permutations.add(new ArrayList<>(current));
        } else {
            // Loop through all the elements in the array
            for (int num : nums) {
                // Skip if the current number is already there
                if (current.contains(num)) {
                    continue;
                }
                // Add current element to the current list
                current.add(num);
                // Recurse for the next index
                backtrack(nums, permutations, current);
                // Backtrack
                current.remove(current.size() - 1);
            }
        }
    }
}
