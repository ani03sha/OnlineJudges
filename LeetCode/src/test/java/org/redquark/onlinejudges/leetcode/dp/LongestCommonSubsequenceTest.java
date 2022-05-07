package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence testObject = new LongestCommonSubsequence();

    @Test
    public void testLongestCommonSubsequenceOne() {
        String text1 = "abcde";
        String text2 = "ace";
        assertEquals(3, testObject.longestCommonSubsequenceOne(text1, text2));

        text1 = "abc";
        text2 = "abc";
        assertEquals(3, testObject.longestCommonSubsequenceOne(text1, text2));

        text1 = "abc";
        text2 = "def";
        assertEquals(0, testObject.longestCommonSubsequenceOne(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceTwo() {
        String text1 = "abcde";
        String text2 = "ace";
        assertEquals(3, testObject.longestCommonSubsequenceTwo(text1, text2));

        text1 = "abc";
        text2 = "abc";
        assertEquals(3, testObject.longestCommonSubsequenceTwo(text1, text2));

        text1 = "abc";
        text2 = "def";
        assertEquals(0, testObject.longestCommonSubsequenceTwo(text1, text2));
    }
}