package org.redquark.onlinejudges.workattech.dp;

public class LongestPalindromicSubstring {

    public String lps(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // starting index of the LPS
        int index = 0;
        // Since every character in a string is an
        // LPS of size 1
        int maxLength = 1;
        // Loop through the string
        for (int i = 1; i < n; i++) {
            // For odd length LPS
            int left = i - 1;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    index = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
            // For even length LPS
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    index = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
        }
        // Find the LPS
        StringBuilder output = new StringBuilder();
        for (int i = index; i < index + maxLength; i++) {
            output.append(s.charAt(i));
        }
        return output.toString();
    }
}
