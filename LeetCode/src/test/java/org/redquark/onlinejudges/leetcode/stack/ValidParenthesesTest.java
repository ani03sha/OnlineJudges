package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses testObject = new ValidParentheses();

    @Test
    public void testIsValid() {
        String s = "()";
        assertTrue(testObject.isValid(s));

        s = "()[]{}";
        assertTrue(testObject.isValid(s));

        s = "(]";
        assertFalse(testObject.isValid(s));

        s = "([)]";
        assertFalse(testObject.isValid(s));

        s = "{[]}";
        assertTrue(testObject.isValid(s));
    }
}