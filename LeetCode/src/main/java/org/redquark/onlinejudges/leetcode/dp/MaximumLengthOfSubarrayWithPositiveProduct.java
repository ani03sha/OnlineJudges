package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class MaximumLengthOfSubarrayWithPositiveProduct {

    public int getMaxLen(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Variable to store the maximum length of subarray
        // with positive product
        int maxLength = 0;
        // Variable to store the index of first negative element
        int firstNegativeIndex = -1;
        // Variable to store the index of last zero
        int zeroIndex = -1;
        // Total number of negative elements in a window
        int negativeCount = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is negative
            if (nums[i] < 0) {
                // Update the negative count
                negativeCount++;
                // If the negative element is occurred for
                // the first time, update the index
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
                // If the count of negative elements in the
                // current window is greater than zero and
                // even, then we will update the maxLength
                else {
                    if (negativeCount % 2 == 0) {
                        maxLength = Math.max(maxLength, i - zeroIndex);
                    }
                }
            }
            // If the current element is zero
            else if (nums[i] == 0) {
                // Reset everything
                firstNegativeIndex = -1;
                negativeCount = 0;
                zeroIndex = i;
            }
            // If the current element is positive
            else {
                // If the negative count is even
                if (negativeCount % 2 == 0) {
                    maxLength = Math.max(maxLength, i - zeroIndex);
                }
                // If the negative count is odd, then we will skip
                // the first negative element
                else {
                    maxLength = Math.max(maxLength, i - firstNegativeIndex);
                }
            }
        }
        return maxLength;
    }
}
