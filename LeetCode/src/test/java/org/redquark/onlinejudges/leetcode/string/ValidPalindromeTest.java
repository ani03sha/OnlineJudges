package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testIsPalindromeBruteForce() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindromeBruteForce(s));

        s = "race a car";
        assertFalse(validPalindrome.isPalindromeBruteForce(s));

        s = " ";
        assertTrue(validPalindrome.isPalindromeBruteForce(s));
    }

    @Test
    public void testIsPalindromeSuboptimal() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindromeSuboptimal(s));

        s = "race a car";
        assertFalse(validPalindrome.isPalindromeSuboptimal(s));

        s = " ";
        assertTrue(validPalindrome.isPalindromeSuboptimal(s));
    }

    @Test
    public void testIsPalindromeOptimal() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindromeOptimal(s));

        s = "race a car";
        assertFalse(validPalindrome.isPalindromeOptimal(s));

        s = " ";
        assertTrue(validPalindrome.isPalindromeOptimal(s));
    }
}