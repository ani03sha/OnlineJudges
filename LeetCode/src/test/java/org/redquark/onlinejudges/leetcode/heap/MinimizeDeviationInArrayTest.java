package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeDeviationInArrayTest {

    private final MinimizeDeviationInArray testObject = new MinimizeDeviationInArray();

    @Test
    public void testMinimumDeviation() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertEquals(1, testObject.minimumDeviation(nums));

        nums = new int[]{4, 1, 5, 20, 3};
        assertEquals(3, testObject.minimumDeviation(nums));

        nums = new int[]{2, 10, 8};
        assertEquals(3, testObject.minimumDeviation(nums));
    }

}