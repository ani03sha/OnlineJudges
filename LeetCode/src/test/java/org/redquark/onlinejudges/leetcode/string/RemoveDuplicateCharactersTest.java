package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateCharactersTest {

    private final RemoveDuplicateCharacters testObject = new RemoveDuplicateCharacters();

    @Test
    public void testRemoveDuplicateLetters() {
        String s = "bcabc";
        assertEquals("abc", testObject.removeDuplicateLetters(s));

        s = "cbacdcbc";
        assertEquals("acdb", testObject.removeDuplicateLetters(s));
    }
}