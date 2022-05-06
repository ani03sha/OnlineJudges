package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Anirudh Sharma
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicatesOne(String s) {
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

    public String removeDuplicatesTwo(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Stack to store the unique characters
        Deque<Character> stack = new ArrayDeque<>();
        // Loop through the string
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        // StringBuilder to store the output
        StringBuilder output = new StringBuilder();
        for (char c : stack) {
            output.append(c);
        }
        return output.reverse().toString();
    }
}
