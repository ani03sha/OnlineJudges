package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseANDOfNumbersRangeTest {

    private final BitwiseANDOfNumbersRange testObject = new BitwiseANDOfNumbersRange();

    @Test
    public void testRangeBitwiseAnd() {
        assertEquals(4, testObject.rangeBitwiseAnd(5, 7));
        assertEquals(0, testObject.rangeBitwiseAnd(0, 0));
        assertEquals(0, testObject.rangeBitwiseAnd(1, 2147483647));
    }
}