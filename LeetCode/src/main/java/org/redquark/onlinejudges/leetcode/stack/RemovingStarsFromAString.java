package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

public class RemovingStarsFromAString {

    public String removeStars(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Stack to store the characters
        Stack<Character> characters = new Stack<>();
        // Loop through the string
        for (char c : s.toCharArray()) {
            if (c == '*') {
                characters.pop();
            } else {
                characters.push(c);
            }
        }
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        while (!characters.isEmpty()) {
            result.append(characters.pop());
        }
        return result.reverse().toString();
    }
}
