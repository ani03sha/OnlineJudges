package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        // List to store all the unique permutations
        List<List<Integer>> uniquePermutations = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return uniquePermutations;
        }
        // Sort the array
        Arrays.sort(nums);
        // Perform backtracking algorithm from the start index
        backtrack(nums, uniquePermutations, new ArrayList<>(), new boolean[nums.length]);
        return uniquePermutations;
    }

    private void backtrack(int[] nums, List<List<Integer>> permutations, List<Integer> current, boolean[] visited) {
        if (nums.length == current.size()) {
            // Add the current list to the permutations
            permutations.add(new ArrayList<>(current));
        } else {
            // Loop through all the elements in the array
            for (int i = 0; i < nums.length; i++) {
                // Skip if the current number is already there
                if (visited[i] || i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) {
                    continue;
                }
                // Mark current elements as visited
                visited[i] = true;
                // Add current element to the current list
                current.add(nums[i]);
                // Recurse for the next index
                backtrack(nums, permutations, current, visited);
                // Backtrack
                visited[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }
}
