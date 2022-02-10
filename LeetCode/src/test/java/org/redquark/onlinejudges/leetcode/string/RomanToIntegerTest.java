package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger testObject = new RomanToInteger();

    @Test
    public void testRomanToInt() {
        String s = "III";
        assertEquals(3, testObject.romanToInt(s));

        s = "LVIII";
        assertEquals(58, testObject.romanToInt(s));

        s = "MCMXCIV";
        assertEquals(1994, testObject.romanToInt(s));
    }
}