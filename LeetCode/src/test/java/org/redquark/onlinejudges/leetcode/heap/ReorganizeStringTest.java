package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorganizeStringTest {

    private final ReorganizeString testObject = new ReorganizeString();

    @Test
    public void testReorganizeString() {
        String s = "aab";
        assertEquals("aba", testObject.reorganizeString(s));

        s = "aaab";
        assertEquals("", testObject.reorganizeString(s));
    }
}