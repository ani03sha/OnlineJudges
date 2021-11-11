package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerifyingAnAlienDictionaryTest {

    private final VerifyingAnAlienDictionary testObject = new VerifyingAnAlienDictionary();

    @Test
    public void testIsAlienSorted() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(testObject.isAlienSorted(words, order));

        words = new String[]{"word", "world", "row"};
        order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(testObject.isAlienSorted(words, order));

        words = new String[]{"apple", "app"};
        order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(testObject.isAlienSorted(words, order));
    }
}