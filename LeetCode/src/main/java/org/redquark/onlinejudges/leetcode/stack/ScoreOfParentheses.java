package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class ScoreOfParentheses {

    public int scoreOfParentheses(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Stack to store the left parentheses
        Stack<Integer> leftParentheses = new Stack<>();
        // Total score
        int score = 0;
        // Loop through the string
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftParentheses.push(score);
                score = 0;
            } else {
                score = leftParentheses.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
}
