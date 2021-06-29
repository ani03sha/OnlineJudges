package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes testObject = new MaxConsecutiveOnes();

    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        assertEquals(3, testObject.findMaxConsecutiveOnes(nums));

        nums = new int[]{1, 0, 1, 1, 0, 1};
        assertEquals(2, testObject.findMaxConsecutiveOnes(nums));
    }
}