package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumRemoveToMakeValidParenthesesTest {

    private final MinimumRemoveToMakeValidParentheses testObject = new MinimumRemoveToMakeValidParentheses();

    @Test
    public void testMinRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        assertEquals("lee(t(c)o)de", testObject.minRemoveToMakeValid(s));

        s = "a)b(c)d";
        assertEquals("ab(c)d", testObject.minRemoveToMakeValid(s));
    }
}