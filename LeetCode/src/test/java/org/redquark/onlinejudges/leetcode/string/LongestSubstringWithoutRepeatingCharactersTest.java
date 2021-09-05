package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters testObject =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testLengthOfLongestSubstring() {
        String s = "abcabcbb";
        assertEquals(3, testObject.lengthOfLongestSubstring(s));

        s = "bbbbb";
        assertEquals(1, testObject.lengthOfLongestSubstring(s));

        s = "pwwkew";
        assertEquals(3, testObject.lengthOfLongestSubstring(s));

        s = "";
        assertEquals(0, testObject.lengthOfLongestSubstring(s));
    }
}