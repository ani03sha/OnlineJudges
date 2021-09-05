package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {

    private final RansomNote testObject = new RansomNote();

    @Test
    public void testCanConstruct() {
        String ransomNote = "a";
        String magazine = "b";
        assertFalse(testObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";
        assertFalse(testObject.canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";
        assertTrue(testObject.canConstruct(ransomNote, magazine));
    }
}