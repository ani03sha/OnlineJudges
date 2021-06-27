package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class Candy {

    public int candy(int[] ratings) {
        // Special cases
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        // Total number of children
        int n = ratings.length;
        // Create two arrays, one for left neighbors
        // and other for right neighbors
        int[] left = new int[n];
        int[] right = new int[n];
        // The initial values will be 1 as every child
        // must have at least one candy
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        // Traverse the array for left chldren
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        // Traverse the array for right children
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        // Total number of candies required
        int candies = 0;
        for (int i = 0; i < n; i++) {
            candies += Math.max(left[i], right[i]);
        }
        return candies;
    }
}
