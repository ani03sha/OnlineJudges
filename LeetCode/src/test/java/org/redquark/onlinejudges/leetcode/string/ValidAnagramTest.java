package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    private final ValidAnagram testObject = new ValidAnagram();

    @Test
    public void testIsAnagram() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(testObject.isAnagram(s, t));

        s = "rat";
        t = "car";
        assertFalse(testObject.isAnagram(s, t));
    }
}