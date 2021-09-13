package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {

    private final NumberOf1Bits testObject = new NumberOf1Bits();

    @Test
    public void testHammingWeight() {
        int n = Integer.parseInt("00000000000000000000000000001011", 2);
        assertEquals(3, testObject.hammingWeight(n));

        n = Integer.parseInt("00000000000000000000000010000000", 2);
        assertEquals(1, testObject.hammingWeight(n));
    }
}