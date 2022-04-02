package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeIITest {

    private final ValidPalindromeII testObject = new ValidPalindromeII();

    @Test
    public void testValidPalindrome() {
        String s = "aba";
        assertTrue(testObject.validPalindrome(s));

        s = "abca";
        assertTrue(testObject.validPalindrome(s));

        s = "abc";
        assertFalse(testObject.validPalindrome(s));
    }
}