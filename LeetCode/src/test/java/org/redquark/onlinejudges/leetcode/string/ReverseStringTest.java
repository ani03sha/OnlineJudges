package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {

    private final ReverseString testObject = new ReverseString();

    @Test
    public void testReverseString() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, testObject.reverseString(s));

        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        assertArrayEquals(expected, testObject.reverseString(s));
    }
}