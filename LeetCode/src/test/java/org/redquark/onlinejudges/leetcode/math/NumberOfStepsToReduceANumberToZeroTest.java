package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTest {

    private final NumberOfStepsToReduceANumberToZero testObject = new NumberOfStepsToReduceANumberToZero();

    @Test
    public void testNumberOfSteps() {
        int num = 14;
        assertEquals(6, testObject.numberOfSteps(num));

        num = 8;
        assertEquals(4, testObject.numberOfSteps(num));

        num = 123;
        assertEquals(12, testObject.numberOfSteps(num));
    }
}