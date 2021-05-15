package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class PerfectSquares {

    public int numSquares(int n) {
        // Get the square root of the number
        int squareRoot = (int) Math.sqrt(n);
        // At this point, we have numbers from 1 to squareRoot,
        // using which we can create n.
        // Create a DP array to store the least number of
        // perfect squares to create a certain number.
        int[] lookup = new int[n + 1];
        // Fill this array with default values
        Arrays.fill(lookup, Integer.MAX_VALUE);
        // We don't need any number to make 0
        lookup[0] = 0;
        // Loop for all the numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Loop for every number from 1 to squareRoot
            for (int j = 1; j <= squareRoot; j++) {
                if (j * j <= i) {
                    lookup[i] = Math.min(lookup[i], lookup[i - j * j] + 1);
                }
            }
        }
        return lookup[n];
    }
}
