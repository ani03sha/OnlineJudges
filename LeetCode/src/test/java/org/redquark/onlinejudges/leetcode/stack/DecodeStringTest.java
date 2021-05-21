package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeStringTest {

    private final DecodeString testObject = new DecodeString();

    @Test
    public void testDecodeString() {
        String s = "3[a]2[bc]";
        assertEquals("aaabcbc", testObject.decodeString(s));

        s = "3[a2[c]]";
        assertEquals("accaccacc", testObject.decodeString(s));

        s = "2[abc]3[cd]ef";
        assertEquals("abcabccdcdcdef", testObject.decodeString(s));

        s = "abc3[cd]xyz";
        assertEquals("abccdcdcdxyz", testObject.decodeString(s));
    }
}