package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesTest {

    private final LongestValidParentheses testObject = new LongestValidParentheses();

    @Test
    public void testLongestValidParentheses() {
        String s = "(()";
        assertEquals(2, testObject.longestValidParentheses(s));

        s = ")()())";
        assertEquals(4, testObject.longestValidParentheses(s));

        s = "";
        assertEquals(0, testObject.longestValidParentheses(s));
    }
}