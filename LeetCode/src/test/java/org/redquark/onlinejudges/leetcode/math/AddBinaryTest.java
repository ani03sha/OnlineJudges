package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    private final AddBinary testObject = new AddBinary();

    @Test
    public void testAddBinary() {
        String a = "11";
        String b = "1";
        assertEquals("100", testObject.addBinary(a, b));

        a = "1010";
        b = "1011";
        assertEquals("10101", testObject.addBinary(a, b));
    }
}