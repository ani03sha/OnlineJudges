package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingBitsTest {

    private final CountingBits testObject = new CountingBits();

    @Test
    public void testCountBits() {
        int n = 2;
        int[] expected = new int[]{0, 1, 1};
        assertArrayEquals(expected, testObject.countBits(n));

        n = 5;
        expected = new int[]{0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, testObject.countBits(n));
    }
}