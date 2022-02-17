package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // List to store th combinatons
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

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentList, List<List<Integer>> combinations) {
        // Special cases
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(currentList));
        }
        // Check every candidate from start to the end of the array
        for (int i = start; i < candidates.length; i++) {
            // Add current number to the current list (choose)
            currentList.add(candidates[i]);
            // Test if this number gives us valid result (check)
            // We are not incrementing i because duplicates are
            // allowed
            backtrack(candidates, target - candidates[i], i, currentList, combinations);
            // Backtrack now (backtrack)
            currentList.remove(currentList.size() - 1);
        }
    }
}
