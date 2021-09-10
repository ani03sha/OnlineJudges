package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UglyNumberIITest {

    private final UglyNumberII testObject = new UglyNumberII();

    @Test
    public void testNthUglyNumber() {
        assertEquals(12, testObject.nthUglyNumber(10));
        assertEquals(1, testObject.nthUglyNumber(1));
    }
}