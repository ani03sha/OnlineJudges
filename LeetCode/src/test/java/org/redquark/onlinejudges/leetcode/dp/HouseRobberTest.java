package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {

    private final HouseRobber testObject = new HouseRobber();

    @Test
    void testRob() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(4, testObject.rob(nums));

        nums = new int[]{2, 7, 9, 3, 1};
        assertEquals(12, testObject.rob(nums));
    }
}