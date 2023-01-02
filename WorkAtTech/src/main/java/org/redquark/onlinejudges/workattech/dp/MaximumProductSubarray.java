package org.redquark.onlinejudges.workattech.dp;

public class MaximumProductSubarray {

    public int maxProduct(int[] A) {
        // Special case
        if (A == null || A.length == 0) {
            return 0;
        }
        // Variable to keep track of the maximum product
        // of the entire array
        int globalMax = A[0];
        // Variable to keep track of the maximum product
        // of the current window
        int localMax = A[0];
        // Variable to keep track of the minimum product
        // of the current window
        int localMin = A[0];
        // Process the remaining elements of the array
        for (int i = 1; i < A.length; i++) {
            // Keep track of the localMax so far
            int temp = localMax;
            // Find the localMax
            localMax = Math.max(A[i], Math.max(localMax * A[i], localMin * A[i]));
            // Find the localMin
            localMin = Math.min(A[i], Math.min(temp * A[i], localMin * A[i]));
            // Update the globalMax, if required
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
