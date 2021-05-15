package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class TwoKeysKeyboard {

    public int minSteps(int n) {
        // Special case
        if (n <= 1) {
            return 0;
        }
        // Lookup table to store the minimum steps needed
        // to make text of specified length
        int[] lookup = new int[n + 1];
        // Populate the table for every length
        for (int i = 1; i <= n; i++) {
            lookup[i] = i;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    lookup[i] = lookup[j] + i / j;
                    break;
                }
            }
        }
        return lookup[n];
    }
}
