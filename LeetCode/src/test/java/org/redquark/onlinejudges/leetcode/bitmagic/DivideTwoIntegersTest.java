package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {

    private final DivideTwoIntegers testObject = new DivideTwoIntegers();

    @Test
    public void testDivide() {
        int dividend = 10;
        int divisor = 3;
        assertEquals(3, testObject.divide(dividend, divisor));

        dividend = 7;
        divisor = -3;
        assertEquals(-2, testObject.divide(dividend, divisor));
    }
}