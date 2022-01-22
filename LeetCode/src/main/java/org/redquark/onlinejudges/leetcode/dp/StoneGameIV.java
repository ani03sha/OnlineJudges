package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class StoneGameIV {

    public boolean winnerSquareGame(int n) {
        // Lookup table to store the results
        boolean[] lookup = new boolean[n + 1];
        // Loop through all the stones from 1 to n
        for (int i = 1; i <= n; i++) {
            // Here, we will choose the must lose strategy
            // for the player j, which will give us must win strategy
            // for the player i.
            for (int j = 1; j * j <= i; j++) {
                if (!lookup[i - j * j]) {
                    lookup[i] = true;
                    break;
                }
            }
        }
        return lookup[n];
    }
}
