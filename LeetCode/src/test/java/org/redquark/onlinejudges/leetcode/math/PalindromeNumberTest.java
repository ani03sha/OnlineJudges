package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    private final PalindromeNumber testObject = new PalindromeNumber();

    @Test
    public void testIsPalindrome() {
        assertTrue(testObject.isPalindrome(121));
        assertFalse(testObject.isPalindrome(-121));
        assertFalse(testObject.isPalindrome(10));
    }
}