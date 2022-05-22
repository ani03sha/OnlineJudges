package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicSubstringsTest {

    private final PalindromicSubstrings testObject = new PalindromicSubstrings();

    @Test
    public void testCountSubstrings() {
        String s = "abc";
        assertEquals(3, testObject.countSubstrings(s));

        s = "aaa";
        assertEquals(6, testObject.countSubstrings(s));
    }
}