package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Stack to store the left parenthesis
        Stack<Character> leftParentheses = new Stack<>();
        // Loop through the string
        for (char c : s.toCharArray()) {
            /// If the current character is any of the left parentheses,
            // we will add it to the stack so that it can be matched by
            // the right type parentheses
            if (c == '(' || c == '{' || c == '[') {
                leftParentheses.push(c);
            }
            // If the current character is ), we will check if we have found the matching
            // left parenthesis ( in the stack
            else if (c == ')' && !leftParentheses.isEmpty() && leftParentheses.peek() == '(') {
                leftParentheses.pop();
            }
            // If the current character is }, we will check if we have found the matching
            // left parenthesis ( in the stack
            else if (c == '}' && !leftParentheses.isEmpty() && leftParentheses.peek() == '{') {
                leftParentheses.pop();
            }
            // If the current character is ], we will check if we have found the matching
            // left parenthesis [ in the stack
            else if (c == ']' && !leftParentheses.isEmpty() && leftParentheses.peek() == '[') {
                leftParentheses.pop();
            }
            // If the current character is an invalid character
            else {
                return false;
            }
        }
        // At this point, for a valid string, all the left parentheses
        // would be removed, thus, we can check the size of the stack
        return leftParentheses.size() == 0;
    }
}
