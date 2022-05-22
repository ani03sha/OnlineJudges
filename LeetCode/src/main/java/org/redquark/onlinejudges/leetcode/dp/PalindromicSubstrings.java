package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Count to store the total palindromic substrings
        int count = 0;
        // Loop through the every character of the string
        for (int i = 0; i < s.length(); i++) {
            // For odd length strings, s[i] is the midpoint
            count += expandFromMiddle(s, i, i);
            // For even length strings, s[i] and s[i + 1] are
            // the midpoints
            count += expandFromMiddle(s, i, i + 1);
        }
        return count;
    }

    private int expandFromMiddle(String s, int start, int end) {
        int count = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
        return count;
    }
}
