package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthTribonacciNumberTest {

    private final NthTribonacciNumber testObject = new NthTribonacciNumber();

    @Test
    public void testTribonacci() {
        assertEquals(4, testObject.tribonacci(4));
        assertEquals(1389537, testObject.tribonacci(25));
    }
}