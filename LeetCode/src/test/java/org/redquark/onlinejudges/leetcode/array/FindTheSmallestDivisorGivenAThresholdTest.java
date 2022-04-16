package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSmallestDivisorGivenAThresholdTest {

    private final FindTheSmallestDivisorGivenAThreshold testObject = new FindTheSmallestDivisorGivenAThreshold();

    @Test
    public void testSmallestDivisor() {
        int[] nums = new int[]{1, 2, 5, 9};
        int threshold = 6;
        assertEquals(5, testObject.smallestDivisor(nums, threshold));

        nums = new int[]{44, 22, 33, 11, 1};
        threshold = 5;
        assertEquals(44, testObject.smallestDivisor(nums, threshold));
    }
}