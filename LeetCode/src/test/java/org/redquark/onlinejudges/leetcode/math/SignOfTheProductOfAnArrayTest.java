package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignOfTheProductOfAnArrayTest {

    private final SignOfTheProductOfAnArray testObject = new SignOfTheProductOfAnArray();

    @Test
    public void testArraySign() {
        int[] nums = new int[]{-1, -2, -3, -4, 3, 2, 1};
        assertEquals(1, testObject.arraySign(nums));

        nums = new int[]{1, 5, 0, 2, -3};
        assertEquals(0, testObject.arraySign(nums));

        nums = new int[]{-1, 1, -1, 1, -1};
        assertEquals(-1, testObject.arraySign(nums));
    }
}