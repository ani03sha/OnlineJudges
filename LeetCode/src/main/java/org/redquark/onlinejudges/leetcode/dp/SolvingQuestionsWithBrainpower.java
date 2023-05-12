package org.redquark.onlinejudges.leetcode.dp;

public class SolvingQuestionsWithBrainpower {

    public long mostPoints(int[][] questions) {
        // Special case
        if (questions == null || questions.length == 0) {
            return 0;
        }
        // Length of the array
        int n = questions.length;
        // Lookup table to store the points if we started
        // solving that question
        long[] lookup = new long[n];
        // Base initialization
        lookup[n - 1] = questions[n - 1][0];
        // Populate the remaining arrat
        for (int i = n - 2; i >= 0; i--) {
            lookup[i] = questions[i][0];
            int skip = questions[i][1];
            if (i + skip + 1 < n) {
                lookup[i] += lookup[i + skip + 1];
            }
            // Either choose it or skip it
            lookup[i] = Math.max(lookup[i], lookup[i + 1]);
        }
        return lookup[0];
    }
}
