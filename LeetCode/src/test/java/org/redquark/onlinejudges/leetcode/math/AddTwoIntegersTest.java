package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoIntegersTest {

    private final AddTwoIntegers testObject = new AddTwoIntegers();

    @Test
    public void testSum() {
        int num1 = 12;
        int num2 = 5;
        assertEquals(17, testObject.sum(num1, num2));

        num1 = -10;
        num2 = 4;
        assertEquals(-6, testObject.sum(num1, num2));
    }
}