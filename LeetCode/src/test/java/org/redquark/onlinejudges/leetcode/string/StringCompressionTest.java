package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionTest {

    private final StringCompression testObject = new StringCompression();

    @Test
    public void testCompress() {
        char[] chars = new char[]{'a', 'x'};
        assertEquals(2, testObject.compress(chars));

        chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, testObject.compress(chars));

        chars = new char[]{'a'};
        assertEquals(1, testObject.compress(chars));

        chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, testObject.compress(chars));

        chars = new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        assertEquals(6, testObject.compress(chars));
    }
}