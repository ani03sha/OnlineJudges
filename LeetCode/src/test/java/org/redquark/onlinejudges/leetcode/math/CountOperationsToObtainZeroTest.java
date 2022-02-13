package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOperationsToObtainZeroTest {

    private final CountOperationsToObtainZero testObject = new CountOperationsToObtainZero();

    @Test
    public void testCountOperationsSolutionOne() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(3, testObject.countOperationsSolutionOne(num1, num2));

        num1 = 10;
        num2 = 10;
        assertEquals(1, testObject.countOperationsSolutionOne(num1, num2));
    }

    @Test
    public void testCountOperationsSolutionTwo() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(3, testObject.countOperationsSolutionTwo(num1, num2));

        num1 = 10;
        num2 = 10;
        assertEquals(1, testObject.countOperationsSolutionTwo(num1, num2));
    }
}