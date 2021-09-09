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
            // If the current character is one of the left parentheses (, {, [, we
            // will push them to the stack
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
            } else {
                return false;
            }
        }
        return leftParentheses.size() == 0;
    }
}
