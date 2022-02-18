package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        // Special cases
        if (num == null || num.isEmpty() || num.length() == k) {
            return "0";
        }
        // Length of the string
        int n = num.length();
        // Monotonic stack
        Stack<Character> monotone = new Stack<>();
        // Loop through the string
        for (int i = 0; i < n; i++) {
            // If the current character is less than the top
            // of the stack, we will pop from the stack
            while (k > 0 && !monotone.isEmpty() && num.charAt(i) < monotone.peek()) {
                monotone.pop();
                k--;
            }
            // Push the current character in the stack
            monotone.push(num.charAt(i));
        }
        // Handle case where same digits are occurring
        while (k > 0) {
            monotone.pop();
            k--;
        }
        // Resultant string
        StringBuilder result = new StringBuilder();
        // Add every character from stack to string builder
        while (!monotone.isEmpty()) {
            char currentCharacter = monotone.pop();
            result.append(currentCharacter);
        }
        // Reverse the string
        result.reverse();
        // Logic for removing leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
