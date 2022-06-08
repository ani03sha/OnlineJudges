package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Start and end pointers
        int start = 0;
        int end = s.length() - 1;
        // Loop to check for palindrome
        while (start < end) {
            // If the string contains only one type of characters,
            // then it will be a palindrome string and if the characters
            // at both ends are same then also, it will be a palindromic
            // string
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return 2;
            }
        }
        return 1;
    }
}
