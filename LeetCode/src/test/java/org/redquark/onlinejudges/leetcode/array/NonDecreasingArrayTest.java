package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonDecreasingArrayTest {

    private final NonDecreasingArray testObject = new NonDecreasingArray();

    @Test
    public void testCheckPossibility() {
        int[] nums = new int[]{4, 2, 3};
        assertTrue(testObject.checkPossibility(nums));

        nums = new int[]{4, 2, 1};
        assertFalse(testObject.checkPossibility(nums));
    }
}