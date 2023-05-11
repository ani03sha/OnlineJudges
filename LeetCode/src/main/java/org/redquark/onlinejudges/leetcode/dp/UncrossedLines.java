package org.redquark.onlinejudges.leetcode.dp;

public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B) {
        // Length of both the arrays
        int x = A.length;
        int y = B.length;
        // DP array
        Integer[][] dp = new Integer[x + 1][y + 1];
        return maxUncrossedLines(A, 0, B, 0, dp);
    }

    private int maxUncrossedLines(int[] A, int i, int[] B, int j, Integer[][] dp) {
        if (i >= A.length || j >= B.length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (A[i] == B[j]) {
            dp[i][j] = 1 + maxUncrossedLines(A, i + 1, B, j + 1, dp);
        } else {
            dp[i][j] = Math.max(maxUncrossedLines(A, i + 1, B, j, dp), maxUncrossedLines(A, i, B, j + 1, dp));
        }
        return dp[i][j];
    }
}
