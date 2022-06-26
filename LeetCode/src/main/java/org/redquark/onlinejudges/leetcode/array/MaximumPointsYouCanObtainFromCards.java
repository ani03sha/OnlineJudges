package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaximumPointsYouCanObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        // Special case
        if (cardPoints == null || cardPoints.length == 0 || k > cardPoints.length) {
            throw new IllegalArgumentException("Invalid input(s)");
        }
        // Length of the array
        int n = cardPoints.length;
        // Total sum of all the elements in the array
        int totalSum = 0;
        // Sum of current window
        int currentWindowSum = 0;
        // Start and end pointers of the window of size n - k
        int start = 0;
        int end = 0;
        // Maximum points achieved by obtaining k cards
        int minPoints = Integer.MAX_VALUE;
        // Loop until the end pointer reaches the end
        while (end < n) {
            totalSum += cardPoints[end];
            currentWindowSum += cardPoints[end];
            // If we are expanding outside of the window of
            // size n - k, we will remove the element at the
            // start index
            if (end - start + 1 > n - k) {
                currentWindowSum -= cardPoints[start];
                start++;
            }
            // If we have reached the window of size n - k,
            // we will choose the minimum sum window
            if (end - start + 1 == n - k) {
                minPoints = Math.min(minPoints, currentWindowSum);
            }
            end++;
        }
        return totalSum - minPoints;
    }
}
