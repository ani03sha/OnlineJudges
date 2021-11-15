package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomPickIndexTest {

    private RandomPickIndex testObject;

    @Test
    public void testPickOne() {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        testObject = new RandomPickIndex(nums);
        assertEquals(4, testObject.pickOne(3));
        assertEquals(0, testObject.pickOne(1));
        assertEquals(2, testObject.pickOne(3));
    }

    @Test
    public void testPickTwo() {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        testObject = new RandomPickIndex(nums);
        assertEquals(4, testObject.pickTwo(3));
        assertEquals(0, testObject.pickTwo(1));
        assertEquals(2, testObject.pickTwo(3));
    }
}