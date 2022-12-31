package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring testObject = new LongestPalindromicSubstring();

    @Test
    public void testLps() {
        String s = "abcdcab";
        assertEquals("cdc", testObject.lps(s));

        s = "abcdcba";
        assertEquals("abcdcba", testObject.lps(s));

        s = "abcd";
        assertEquals("a", testObject.lps(s));

        s = "abaadcd";
        assertEquals("aba", testObject.lps(s));
    }
}