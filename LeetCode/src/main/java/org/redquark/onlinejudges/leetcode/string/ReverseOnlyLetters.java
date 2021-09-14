package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Characters in the input string
        char[] characters = s.toCharArray();
        // Loop until the two pointers meet
        while (left < right) {
            // If the character at the left index is not a letter, skip it
            if (!Character.isLetter(characters[left])) {
                left++;
            }
            // If the character at the right index is not a letter, skip it
            if (!Character.isLetter(characters[right])) {
                right--;
            }
            // Swap the letters at the left and right positions
            if (Character.isLetter(characters[left]) && Character.isLetter(characters[right])) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
        }
        return new String(characters);
    }
}
