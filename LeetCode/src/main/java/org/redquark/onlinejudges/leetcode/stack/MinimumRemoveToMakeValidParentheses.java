package org.redquark.onlinejudges.leetcode.stack;

/**
 * @author Anirudh Sharma
 */
public class MinimumRemoveToMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // String builder to store characters in the forward order
        StringBuilder forward = new StringBuilder();
        // Count of open parentheses
        int open = 0;
        // Loop through the string in forward order
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            forward.append(s.charAt(i));
        }
        // String builder to store characters in the backward order
        StringBuilder backward = new StringBuilder();
        // Count of open parentheses
        int close = 0;
        // Loop through the string in forward order
        for (int i = forward.length() - 1; i >= 0; i--) {
            if (forward.charAt(i) == ')') {
                close++;
            } else if (forward.charAt(i) == '(') {
                if (close == 0) {
                    continue;
                }
                close--;
            }
            backward.append(forward.charAt(i));
        }
        return backward.reverse().toString();
    }
}
