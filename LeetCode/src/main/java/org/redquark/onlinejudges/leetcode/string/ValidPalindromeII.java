package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            // Null or empty string is a palindrome
            return true;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // A palindrome string should have same characters at the left
        // and at the right ends (for even length strings) and a single
        // different character in the middle (for odd length strings).
        // Therefore, we will start comparing the characters at the two
        // ends and if we find a different character, we will delete it
        // and perform the same exercises for the remaining string. If
        // we find a different character second time, we will return false
        // else we will return true
        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        // If the whole string is traversed and we haven't find any
        // character that breaks the palindrome rule, we return true
        if (left >= right) {
            return true;
        }
        // If we reach at this point, it means we have encountered a
        // different character, we will skip it and proceed further.
        // Here, there can be two cases, delete character from the
        // left or from the right. We will check for both conditions.

        // Delete character from left
        int left1 = left + 1;
        int right1 = right;
        while (left1 < right1 && s.charAt(left1) == s.charAt(right1)) {
            left1++;
            right1--;
        }
        if (left1 >= right1) {
            return true;
        }
        // Delete character from right
        int left2 = left;
        int right2 = right - 1;
        while (left2 < right2 && s.charAt(left2) == s.charAt(right2)) {
            left2++;
            right2--;
        }
        return left2 >= right2;
    }
}
