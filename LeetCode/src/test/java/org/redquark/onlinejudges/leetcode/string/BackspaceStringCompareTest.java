package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompareTest {

    private final BackspaceStringCompare testObject = new BackspaceStringCompare();

    @Test
    public void testBackspaceCompare() {
        String s = "ab#c";
        String t = "ad#c";
        assertTrue(testObject.backspaceCompare(s, t));

        s = "ab##";
        t = "c#d#";
        assertTrue(testObject.backspaceCompare(s, t));

        s = "a#c";
        t = "b";
        assertFalse(testObject.backspaceCompare(s, t));
    }
}