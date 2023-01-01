package org.redquark.onlinejudges.workattech.dp;

public class SubsetSum {

    public boolean hasValidSubset(int[] A, int target) {
        // Special case
        if (A == null || A.length == 0) {
            return false;
        }
        // Length of the array
        int n = A.length;
        Boolean[][] lookup = new Boolean[target + 1][n + 1];
        return hasValidSubset(A, target, n - 1, lookup);
    }

    private boolean hasValidSubset(int[] A, int target, int index, Boolean[][] lookup) {
        // Base case
        if (target == 0) {
            return true;
        }
        if (index < 0) {
            return false;
        }
        // If the new target is less than the current value, we
        // cannot take it into consideration
        if (target < A[index]) {
            return hasValidSubset(A, target, index - 1, lookup);
        }
        // If we have already calculated the value
        // for current result
        if (lookup[target][index] != null) {
            return lookup[target][index];
        }
        return lookup[target][index] = hasValidSubset(A, target - A[index], index - 1, lookup)
                || hasValidSubset(A, target, index - 1, lookup);
    }
}
