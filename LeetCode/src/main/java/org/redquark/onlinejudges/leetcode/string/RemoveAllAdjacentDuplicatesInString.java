package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // Array to store final result
        char[] characters = new char[n];
        // Index for the characters array
        int index = 0;
        // Loop through the string character by character
        for (int i = 0; i < n; i++) {
            // Current character
            char c = s.charAt(i);
            // If the character at right of the array
            // is same as the current character, we will
            // ignore it
            if (index > 0 && characters[index - 1] == c) {
                index--;
            }
            // If the character is not duplicate
            else {
                characters[index] = c;
                index++;
            }
        }
        return new String(characters, 0, index);
    }
}
