package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {

    private final IntegerToRoman testObject = new IntegerToRoman();

    @Test
    public void testIntToRoman() {
        assertEquals("III", testObject.intToRoman(3));
        assertEquals("LVIII", testObject.intToRoman(58));
        assertEquals("MCMXCIV", testObject.intToRoman(1994));
    }
}