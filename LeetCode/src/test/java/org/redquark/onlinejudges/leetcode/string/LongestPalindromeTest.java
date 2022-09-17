package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

    private final LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void testLongestPalindrome() {
        String s = "abccccdd";
        assertEquals(7, longestPalindrome.longestPalindrome(s));

        s = "a";
        assertEquals(1, longestPalindrome.longestPalindrome(s));

        s = "AAAAAA";
        assertEquals(6, longestPalindrome.longestPalindrome(s));
    }
}