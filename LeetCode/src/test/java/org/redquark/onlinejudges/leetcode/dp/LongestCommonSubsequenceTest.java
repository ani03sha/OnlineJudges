package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence testObject = new LongestCommonSubsequence();

    @Test
    public void testLongestCommonSubsequence() {
        String text1 = "abcde";
        String text2 = "ace";
        assertEquals(3, testObject.longestCommonSubsequence(text1, text2));

        text1 = "abc";
        text2 = "abc";
        assertEquals(3, testObject.longestCommonSubsequence(text1, text2));

        text1 = "abc";
        text2 = "def";
        assertEquals(0, testObject.longestCommonSubsequence(text1, text2));
    }
}