package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveKDigitsTest {

    private final RemoveKDigits testObject = new RemoveKDigits();

    @Test
    public void testRemoveKdigits() {
        String num = "1432219";
        int k = 3;
        assertEquals("1219", testObject.removeKdigits(num, k));

        num = "10200";
        k = 1;
        assertEquals("200", testObject.removeKdigits(num, k));

        num = "10";
        k = 2;
        assertEquals("0", testObject.removeKdigits(num, k));
    }
}