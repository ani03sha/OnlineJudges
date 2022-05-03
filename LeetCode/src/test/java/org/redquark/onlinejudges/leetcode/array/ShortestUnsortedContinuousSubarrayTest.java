package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestUnsortedContinuousSubarrayTest {

    private final ShortestUnsortedContinuousSubarray testObject = new ShortestUnsortedContinuousSubarray();

    @Test
    public void testFindUnsortedSubarray() {
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, testObject.findUnsortedSubarray(nums));

        nums = new int[]{1, 2, 3, 4};
        assertEquals(0, testObject.findUnsortedSubarray(nums));

        nums = new int[]{1};
        assertEquals(0, testObject.findUnsortedSubarray(nums));
    }
}