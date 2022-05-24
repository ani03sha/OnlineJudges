package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Variables to keep track of left and right parentheses
        int left = 0;
        int right = 0;
        // Variable to keep track of the longest valid length
        int longestLength = 0;
        // Loop through the string from left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            // If both left and right counts are same, we have valid
            // substring in front of us
            if (left == right) {
                longestLength = Math.max(longestLength, left + right);
            }
            // If right is greater than left, we have encountered an
            // invalid string, so we will reset the counters
            if (right > left) {
                left = right = 0;
            }
        }
        // Reset left and right pointers
        left = right = 0;
        // Traverse the string from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            // If both left and right counts are same, we have valid
            // substring in front of us
            if (left == right) {
                longestLength = Math.max(longestLength, left + right);
            }
            // If right is greater than left, we have encountered an
            // invalid string, so we will reset the counters
            if (left > right) {
                left = right = 0;
            }
        }
        return longestLength;
    }
}
