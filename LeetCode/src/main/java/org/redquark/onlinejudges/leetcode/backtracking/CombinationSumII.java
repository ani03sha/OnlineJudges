package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // List to store the combinations
        List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return combinations;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Perform backtracking
        backtrack(candidates, target, combinations, new ArrayList<>(), 0);
        return combinations;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> combinations, List<Integer> current, int index) {
        // Special cases
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(current));
        }
        // Loop for all the elements in the array
        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // Choose current element
            current.add(candidates[i]);
            // Recurse for the next index
            backtrack(candidates, target - candidates[i], combinations, current, i + 1);
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
