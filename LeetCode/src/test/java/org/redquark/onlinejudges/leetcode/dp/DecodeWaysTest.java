package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeWaysTest {

    private final DecodeWays testObject = new DecodeWays();

    @Test
    public void testNumDecodings() {
        String s = "12";
        assertEquals(2, testObject.numDecodings(s));

        s = "226";
        assertEquals(3, testObject.numDecodings(s));

        s = "0";
        assertEquals(0, testObject.numDecodings(s));

        s = "0";
        assertEquals(0, testObject.numDecodings(s));
    }
}