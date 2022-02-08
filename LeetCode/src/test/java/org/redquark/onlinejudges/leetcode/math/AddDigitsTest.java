package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {

    private final AddDigits testObject = new AddDigits();

    @Test
    public void testAddDigits() {
        assertEquals(2, testObject.addDigitsSolutionOne(38));
        assertEquals(2, testObject.addDigitsSolutionTwo(38));
        assertEquals(0, testObject.addDigitsSolutionOne(0));
        assertEquals(0, testObject.addDigitsSolutionTwo(0));
        assertEquals(1, testObject.addDigitsSolutionOne(Integer.MAX_VALUE));
        assertEquals(1, testObject.addDigitsSolutionTwo(Integer.MAX_VALUE));
    }
}