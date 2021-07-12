package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        // Lookup table to store the unique BSTs with i-th number as the node
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = 1;
        // Populate the remaining lookup table
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                lookup[i] += lookup[j] * lookup[i - j - 1];
            }
        }
        return lookup[n];
    }
}
