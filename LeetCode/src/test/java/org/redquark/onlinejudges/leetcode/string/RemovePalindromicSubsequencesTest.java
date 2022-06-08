package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovePalindromicSubsequencesTest {

    private final RemovePalindromicSubsequences testObject = new RemovePalindromicSubsequences();

    @Test
    public void testRemovePalindromeSub() {
        String s = "ababa";
        assertEquals(1, testObject.removePalindromeSub(s));

        s = "abb";
        assertEquals(2, testObject.removePalindromeSub(s));

        s = "baabb";
        assertEquals(2, testObject.removePalindromeSub(s));
    }
}