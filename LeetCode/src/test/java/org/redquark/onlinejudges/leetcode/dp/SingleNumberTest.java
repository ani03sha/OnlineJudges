package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    private final SingleNumber testObject = new SingleNumber();

    @Test
    public void testSingleNumber() {
        int[] nums = new int[]{2, 2, 1};
        assertEquals(1, testObject.singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        assertEquals(4, testObject.singleNumber(nums));

        nums = new int[]{1};
        assertEquals(1, testObject.singleNumber(nums));
    }
}