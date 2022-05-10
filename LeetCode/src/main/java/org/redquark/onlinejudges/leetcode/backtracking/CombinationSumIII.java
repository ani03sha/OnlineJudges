package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        // List to store the combination sum
        List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (k <= 0 || n <= 0) {
            return combinations;
        }
        // Perform backtracking
        backtrack(n, k, 1, 0, 0, combinations, new ArrayList<>());
        return combinations;
    }

    private void backtrack(int n, int k, int index, int counter, int sum, List<List<Integer>> combinations, List<Integer> current) {
        // Special cases
        if (counter > k) {
            return;
        }
        // If the counter is equal to k and sum is equal to n,
        // we have hit the jackpot
        if (counter == k && sum == n) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        // Loop for all the numbers from index to 9
        for (int i = index; i <= 9; i++) {
            // If we are going out of bounds, we will break out
            if (sum + i > n) {
                break;
            }
            // Choose the current element
            current.add(i);
            // Recurse for next index
            backtrack(n, k, i + 1, counter + 1, sum + i, combinations, current);
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
