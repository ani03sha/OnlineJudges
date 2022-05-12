package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // List to store all the combinations
        List<String> combinations = new ArrayList<>();
        // Special case
        if (n <= 0) {
            return combinations;
        }
        StringBuilder current = new StringBuilder();
        // Perform backtracking
        backtrack(n, current, 0, 0, combinations);
        return combinations;
    }

    private void backtrack(int n, StringBuilder current, int open, int close, List<String> combinations) {
        if (current.length() == 2 * n) {
            combinations.add(current.toString());
            return;
        }
        // We have to add open parentheses until we don't reach
        // the count of n
        if (open < n) {
            current.append("(");
            backtrack(n, current, open + 1, close, combinations);
            current.deleteCharAt(current.length() - 1);
        }
        // We have to add close parentheses until they are equal
        // to the count of open parentheses
        if (close < open) {
            current.append(")");
            backtrack(n, current, open, close + 1, combinations);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
