package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPatternTest {

    private final WordPattern testObject = new WordPattern();

    @Test
    public void testWordPattern() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        assertTrue(testObject.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog cat cat fish";
        assertFalse(testObject.wordPattern(pattern, s));

        pattern = "aaaa";
        s = "dog cat cat dog";
        assertFalse(testObject.wordPattern(pattern, s));
    }
}