package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumXOROfTwoNumbersInAnArrayTest {

    private final MaximumXOROfTwoNumbersInAnArray testObject = new MaximumXOROfTwoNumbersInAnArray();

    @Test
    public void testFindMaximumXOR() {
        int[] nums = new int[]{3, 10, 5, 25, 2, 8};
        assertEquals(28, testObject.findMaximumXOR(nums));

        nums = new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        assertEquals(127, testObject.findMaximumXOR(nums));
    }
}