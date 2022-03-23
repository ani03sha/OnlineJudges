package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrokenCalculatorTest {

    private final BrokenCalculator testObject = new BrokenCalculator();

    @Test
    public void testBrokenCalc() {
        int startValue = 2;
        int target = 3;
        assertEquals(2, testObject.brokenCalc(startValue, target));

        startValue = 5;
        target = 8;
        assertEquals(2, testObject.brokenCalc(startValue, target));

        startValue = 3;
        target = 10;
        assertEquals(3, testObject.brokenCalc(startValue, target));
    }
}