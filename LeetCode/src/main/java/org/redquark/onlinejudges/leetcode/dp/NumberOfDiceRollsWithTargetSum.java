package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class NumberOfDiceRollsWithTargetSum {

    public int numRollsToTarget(int d, int f, int target) {
        // Lookup table to store the ways to make target using
        // given d dice i.e., lookup[i][j] => number of ways to
        // make j using i dice
        int[][] lookup = new int[d + 1][target + 1];
        // There is one way to make target = 0;
        lookup[0][0] = 1;
        // Populate the remaining table
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j <= target; j++) {
                if (target <= f * d) {
                    for (int k = 1; k <= f; k++) {
                        if (k <= j) {
                            lookup[i][j] = (lookup[i][j] + lookup[i - 1][j - k]) % 1000000007;
                        }
                    }
                }
            }
        }
        return lookup[d][target];
    }
}
