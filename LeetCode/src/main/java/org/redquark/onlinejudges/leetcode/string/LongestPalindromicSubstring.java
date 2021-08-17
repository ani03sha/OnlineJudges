package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return "";
        }
        // Start and end pointers for the longest palindromic substring
        int start = 0;
        int end = 0;
        // Loop through the string character by character
        for (int i = 0; i < s.length(); i++) {
            // Expand from center for odd length strings
            int odd = expandFromCenter(s, i, i);
            // Expand from center for even length strings
            int even = expandFromCenter(s, i, i + 1);
            // Find the maximum substring length from above two
            int maxLength = Math.max(odd, even);
            // Update the start and end pointers
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        // Base case
        if (left > right) {
            return 0;
        }
        // Check for the palindrome
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
