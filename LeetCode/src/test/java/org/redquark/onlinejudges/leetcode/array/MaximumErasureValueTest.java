package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumErasureValueTest {

    private final MaximumErasureValue testObject = new MaximumErasureValue();

    @Test
    public void testMaximumUniqueSubarray() {
        int[] nums = new int[]{4, 2, 4, 5, 6};
        assertEquals(17, testObject.maximumUniqueSubarray(nums));

        nums = new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, testObject.maximumUniqueSubarray(nums));
    }
}