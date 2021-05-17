package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDiceRollsWithTargetSumTest {

    private final NumberOfDiceRollsWithTargetSum testObject = new NumberOfDiceRollsWithTargetSum();

    @Test
    public void testNumRollsToTarget() {
        int d = 1;
        int f = 6;
        int target = 3;
        assertEquals(1, testObject.numRollsToTarget(d, f, target));

        d = 2;
        f = 6;
        target = 7;
        assertEquals(6, testObject.numRollsToTarget(d, f, target));

        d = 2;
        f = 5;
        target = 10;
        assertEquals(1, testObject.numRollsToTarget(d, f, target));

        d = 1;
        f = 2;
        target = 3;
        assertEquals(0, testObject.numRollsToTarget(d, f, target));

        d = 30;
        f = 30;
        target = 500;
        assertEquals(222616187, testObject.numRollsToTarget(d, f, target));
    }
}