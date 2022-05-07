package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneThreeTwoPatternTest {

    private final OneThreeTwoPattern testObject = new OneThreeTwoPattern();

    @Test
    public void testFind132pattern() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertFalse(testObject.find132pattern(nums));

        nums = new int[]{3, 1, 4, 2};
        assertTrue(testObject.find132pattern(nums));

        nums = new int[]{-1, 3, 2, 0};
        assertTrue(testObject.find132pattern(nums));
    }
}