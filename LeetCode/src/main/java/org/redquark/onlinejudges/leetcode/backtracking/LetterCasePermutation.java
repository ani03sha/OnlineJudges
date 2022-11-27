package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    /**
     * Time complexity - O(2 ^ n)
     * Space complexity - O(n)
     */
    public List<String> letterCasePermutation(String s) {
        // List to store the final output
        final List<String> output = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty()) {
            return output;
        }
        // Perform backtracking on the string
        backtrack(s.toCharArray(), 0, output);
        return output;
    }

    private void backtrack(char[] characters, int index, List<String> output) {
        // Check if we have traversed all the characters in the word
        if (index == characters.length) {
            output.add(new String(characters));
        }
        // If we have some characters to process
        else {
            // Check if the current character is a letter
            if (Character.isLetter(characters[index])) {
                // If it is a letter, we will make it upper case
                characters[index] = Character.toUpperCase(characters[index]);
                // Backtrack with upper case branch
                backtrack(characters, index + 1, output);
                // Make this character lower case again
                characters[index] = Character.toLowerCase(characters[index]);
                // Backtrack for lower case branch
                backtrack(characters, index + 1, output);
            }
            // If the current character is not a letter, we will just
            // backtrack with the same letter
            else {
                backtrack(characters, index + 1, output);
            }
        }
    }
}
