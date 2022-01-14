package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerAtoiTest {

    private final StringToIntegerAtoi testObject = new StringToIntegerAtoi();

    @Test
    public void testMyAtoi() {
        assertEquals(42, testObject.myAtoi("42"));
        assertEquals(-42, testObject.myAtoi("   -42"));
        assertEquals(4193, testObject.myAtoi("4193 with words"));
        assertEquals(Integer.MAX_VALUE, testObject.myAtoi("        34675434436742146635av"));
    }
}