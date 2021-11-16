package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class KthSmallestNumberInMultiplicationTable {

    public int findKthNumber(int m, int n, int k) {
        // Special case
        if (m * n < k) {
            throw new IllegalArgumentException("Invalid values of m or n or k");
        }
        // Left and right pointers
        int left = 1;
        int right = m * n;
        // Perform binary search
        while (left < right) {
            // Middle value of this range
            int middle = left + (right - left) / 2;
            // If there are more than k values in left,
            // we will reduce our search space to left
            // half of the array...
            if (enough(middle, m, n, k)) {
                right = middle;
            }
            // ... else search in the right half of the array
            else {
                left = middle + 1;
            }
        }
        return left;
    }

    private boolean enough(int x, int m, int n, int k) {
        // Check for all elements less than k
        int count = 0;
        // Loop through all the rows
        for (int i = 1; i <= m; i++) {
            count += Math.min(x / i, n);
        }
        return count >= k;
    }
}
