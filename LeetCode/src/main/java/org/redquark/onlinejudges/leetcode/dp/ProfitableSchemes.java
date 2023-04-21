package org.redquark.onlinejudges.leetcode.dp;

public class ProfitableSchemes {

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        // Special case
        if (group == null || group.length == 0 || profit == null || profit.length == 0) {
            return 0;
        }
        // Modulo value
        final int MODULUS = 1000000007;
        // Number of groups
        int m = group.length;
        // Lookup table to store the results
        final int[][][] lookup = new int[m + 1][n + 1][minProfit + 1];
        // Base initialization
        for (int i = 0; i <= n; i++) {
            lookup[m][i][minProfit] = 1;
        }
        // Populate the table for remaining positions
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= minProfit; k++) {
                    // Don't choose the current crime
                    lookup[i][j][k] = lookup[i + 1][j][k];
                    if (j + group[i] <= n) {
                        // Choose the crime
                        lookup[i][j][k] = (lookup[i][j][k] + lookup[i + 1][j + group[i]][Math.min(minProfit, k + profit[i])]) % MODULUS;
                    }
                }
            }
        }
        return lookup[0][0][0];
    }
}
