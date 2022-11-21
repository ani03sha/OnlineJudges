package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstMissingPositiveTest {

    private final FirstMissingPositive testObject = new FirstMissingPositive();

    @Test
    public void testFirstMissingPositive() {
        int[] nums = new int[]{1, 2, 0};
        assertEquals(3, testObject.firstMissingPositive(nums));

        nums = new int[]{3, 4, -1, 1};
        assertEquals(2, testObject.firstMissingPositive(nums));

        nums = new int[]{7, 8, 9, 11, 12};
        assertEquals(1, testObject.firstMissingPositive(nums));
    }
}