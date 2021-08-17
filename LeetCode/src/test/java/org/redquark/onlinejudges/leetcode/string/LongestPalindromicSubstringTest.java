package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring testObject = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindrome() {
        String s = "babad";
        assertEquals("aba", testObject.longestPalindrome(s));

        s = "cbbd";
        assertEquals("bb", testObject.longestPalindrome(s));

        s = "a";
        assertEquals("a", testObject.longestPalindrome(s));

        s = "ac";
        assertEquals("c", testObject.longestPalindrome(s));
    }
}