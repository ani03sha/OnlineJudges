package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        // List to store all the combinations
        List<List<Integer>> combinations = new ArrayList<>();
        // Special cases
        if (n <= 0 || k > n) {
            return combinations;
        }
        // Perform backtracking
        backtrack(n, k, 1, new ArrayList<>(), combinations);
        return combinations;
    }

    private void backtrack(int n, int k, int index, List<Integer> current, List<List<Integer>> combinations) {
        // Base case
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
        }
        // Loop through all the numbers
        for (int i = index; i <= n; i++) {
            // Take the current element
            current.add(i);
            // Recurse for the next index
            backtrack(n, k, i + 1, current, combinations);
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
