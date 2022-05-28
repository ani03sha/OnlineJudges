package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix testObject = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", testObject.longestCommonPrefix(strs));

        strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", testObject.longestCommonPrefix(strs));
    }
}