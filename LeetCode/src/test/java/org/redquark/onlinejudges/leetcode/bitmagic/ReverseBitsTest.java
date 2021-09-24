package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {

    private final ReverseBits testObject = new ReverseBits();

    @Test
    public void testReverseBits() {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        assertEquals(964176192, testObject.reverseBits(n));
    }
}