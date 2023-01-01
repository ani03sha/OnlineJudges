package org.redquark.onlinejudges.workattech.dp;

import java.util.Arrays;

public class SubsetSum2 {

    public int subsetSum(int[] A, int target) {
        // Special case
        if (A == null || A.length == 0) {
            return 0;
        }
        // Length of the array
        int n = A.length;
        // Lookup table to store results
        int[][] lookup = new int[target + 1][n + 1];
        // Populate the lookup table with default values
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, -1));
        return hasValidSubset(A, target, n - 1, lookup);
    }

    private int hasValidSubset(int[] A, int target, int index, int[][] lookup) {
        // Base case
        if (target == 0) {
            return 1;
        }
        if (index < 0) {
            return 0;
        }
        // If the new target is less than the current value, we
        // cannot take it into consideration
        if (target < A[index]) {
            return hasValidSubset(A, target, index - 1, lookup);
        }
        // If we have already calculated the value
        // for current result
        if (lookup[target][index] != -1) {
            return lookup[target][index];
        }
        return lookup[target][index] = hasValidSubset(A, target - A[index], index - 1, lookup)
                | hasValidSubset(A, target, index - 1, lookup);
    }
}
