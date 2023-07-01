package org.redquark.onlinejudges.leetcode.backtracking;

public class FairDistributionOfCookies {

    private int minimumUnfairness = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        // Special case
        if (cookies == null || cookies.length == 0 || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Array to store the distribution of cookies
        int[] cookieDistribution = new int[k];
        // Perform backtracking
        backtrack(cookies, cookieDistribution, 0, 0);
        return minimumUnfairness;
    }

    private void backtrack(int[] cookies, int[] cookieDistribution, int index, int max) {
        // Base case
        if (index >= cookies.length) {
            minimumUnfairness = Math.min(minimumUnfairness, max);
            return;
        }
        // Number of cookies at the current index
        int cookie = cookies[index];
        for (int i = 0; i < cookieDistribution.length; i++) {
            cookieDistribution[i] += cookie;
            backtrack(cookies, cookieDistribution, index + 1, Math.max(max, cookieDistribution[i]));
            cookieDistribution[i] -= cookie;
        }
    }
}
