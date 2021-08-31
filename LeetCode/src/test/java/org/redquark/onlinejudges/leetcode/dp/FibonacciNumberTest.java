package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {

    private final FibonacciNumber testObject = new FibonacciNumber();

    @Test
    public void testFib() {
        assertEquals(1, testObject.fib(2));
        assertEquals(2, testObject.fib(3));
        assertEquals(3, testObject.fib(4));
    }
}