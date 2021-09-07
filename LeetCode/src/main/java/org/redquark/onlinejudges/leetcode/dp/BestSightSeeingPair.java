package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class BestSightSeeingPair {

    public int maxScoreSightseeingPair(int[] values) {
        // Special case
        if (values == null || values.length < 2) {
            return 0;
        }
        // Ultimately, we have to find maximum value of values[i] + i + values[j] - j.
        // This can be found by knowing the value of i which will give us the maximum score
        int maxScore = 0;
        int previousBestIndex = 0;
        // Loop through the remaining elements
        for (int i = 1; i < values.length; i++) {
            maxScore = Math.max(maxScore, values[previousBestIndex] + previousBestIndex + values[i] - i);
            // Update the previous best index, if required
            if (values[previousBestIndex] + previousBestIndex < values[i] + i) {
                previousBestIndex = i;
            }
        }
        return maxScore;
    }
}
