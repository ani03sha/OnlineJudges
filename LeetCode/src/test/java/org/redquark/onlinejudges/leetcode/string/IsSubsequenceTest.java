package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequenceTest {

    private final IsSubsequence testObject = new IsSubsequence();

    @Test
    public void testIsSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(testObject.isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        assertFalse(testObject.isSubsequence(s, t));
    }
}