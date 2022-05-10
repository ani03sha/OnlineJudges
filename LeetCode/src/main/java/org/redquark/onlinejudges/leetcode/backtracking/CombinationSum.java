package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // List to store th combinations
        List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return combinations;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Call backtracking function
        backtrack(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> combinations) {
        // Special cases
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(current));
        }
        // Check every candidate from start to the end of the array
        for (int i = index; i < candidates.length; i++) {
            // Add current number to the current list (choose)
            current.add(candidates[i]);
            // Test if this number gives us valid result (check)
            // We are not incrementing i because duplicates are
            // allowed
            backtrack(candidates, target - candidates[i], i, current, combinations);
            // Backtrack now (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
