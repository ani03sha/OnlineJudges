package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ReverseString {

    public char[] reverseString(char[] s) {
        // Special case
        if (s == null || s.length == 0) {
            return s;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length - 1;
        // Loop until the two pointers meet
        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // Update the pointers
            left++;
            right--;
        }
        return s;
    }
}
