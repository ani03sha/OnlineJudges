package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    private final ReverseInteger testObject = new ReverseInteger();

    @Test
    public void testReverse() {
        assertEquals(321, testObject.reverse(123));
        assertEquals(-321, testObject.reverse(-123));
        assertEquals(21, testObject.reverse(120));
        assertEquals(0, testObject.reverse(Integer.MAX_VALUE));
        assertEquals(0, testObject.reverse(Integer.MIN_VALUE));
    }
}