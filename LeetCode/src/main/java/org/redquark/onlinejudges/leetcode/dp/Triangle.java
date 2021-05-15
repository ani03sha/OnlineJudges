package org.redquark.onlinejudges.leetcode.dp;

import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        // Special case
        if (triangle == null || triangle.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        // Number of rows in the triangle
        int n = triangle.size();
        // Lookup table to store the minimum possible cumulative sum
        // lookup[i] => Minimum cumulative total of i-th column
        int[] lookup = new int[n];
        // Start from the bottom row
        for (int i = 0; i < n; i++) {
            lookup[i] = triangle.get(n - 1).get(i);
        }
        // Fill the remaining table by choosing the path
        // with the minimum cost
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                lookup[j] = triangle.get(i).get(j) + Math.min(lookup[j], lookup[j + 1]);
            }
        }
        return lookup[0];
    }
}
