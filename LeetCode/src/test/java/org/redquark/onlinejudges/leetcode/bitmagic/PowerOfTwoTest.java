package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwoTest {

    private final PowerOfTwo testObject = new PowerOfTwo();

    @Test
    public void testIsPowerOfTwo() {
        assertTrue(testObject.isPowerOfTwo(1));
        assertTrue(testObject.isPowerOfTwo(16));
        assertFalse(testObject.isPowerOfTwo(3));
    }
}