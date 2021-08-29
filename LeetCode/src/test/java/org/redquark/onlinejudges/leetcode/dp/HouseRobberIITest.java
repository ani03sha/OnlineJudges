package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberIITest {

    private final HouseRobberII testObject = new HouseRobberII();

    @Test
    public void testRob() {
        int[] nums = new int[]{2, 3, 2};
        assertEquals(3, testObject.rob(nums));

        nums = new int[]{1, 2, 3, 1};
        assertEquals(4, testObject.rob(nums));

        nums = new int[]{1, 2, 3};
        assertEquals(3, testObject.rob(nums));
    }
}