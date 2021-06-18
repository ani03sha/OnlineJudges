package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubsequenceTest {

    private final LongestPalindromicSubsequence testObject = new LongestPalindromicSubsequence();

    @Test
    public void testLongestPalindromeSubsequence() {
        String s = "bbbab";
        assertEquals(4, testObject.longestPalindromeSubsequence(s));

        s = "cbbd";
        assertEquals(2, testObject.longestPalindromeSubsequence(s));
    }
}