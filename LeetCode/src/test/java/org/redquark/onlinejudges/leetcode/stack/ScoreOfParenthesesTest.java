package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreOfParenthesesTest {

    private final ScoreOfParentheses testObject = new ScoreOfParentheses();

    @Test
    public void testScoreOfParentheses() {
        String s = "()";
        assertEquals(1, testObject.scoreOfParentheses(s));

        s = "(())";
        assertEquals(2, testObject.scoreOfParentheses(s));

        s = "()()";
        assertEquals(2, testObject.scoreOfParentheses(s));
    }
}