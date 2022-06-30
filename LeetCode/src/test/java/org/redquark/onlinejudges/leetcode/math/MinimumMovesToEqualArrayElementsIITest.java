package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumMovesToEqualArrayElementsIITest {

    private final MinimumMovesToEqualArrayElementsII testObject = new MinimumMovesToEqualArrayElementsII();

    @Test
    public void testMinMoves2() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(2, testObject.minMoves2(nums));

        nums = new int[]{1, 10, 2, 9};
        assertEquals(16, testObject.minMoves2(nums));
    }
}