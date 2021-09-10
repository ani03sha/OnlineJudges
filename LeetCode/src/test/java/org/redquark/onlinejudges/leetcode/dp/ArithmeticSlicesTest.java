package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSlicesTest {

    private final ArithmeticSlices testObject = new ArithmeticSlices();

    @Test
    public void testNumberOfArithmeticSlices() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertEquals(3, testObject.numberOfArithmeticSlices(nums));

        nums = new int[]{1};
        assertEquals(0, testObject.numberOfArithmeticSlices(nums));

    }
}