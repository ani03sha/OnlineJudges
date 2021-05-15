package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs testObject = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairs() {
        int[] cost = new int[]{10, 15, 20};
        assertEquals(15, testObject.minCostClimbingStairs(cost));

        cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, testObject.minCostClimbingStairs(cost));
    }
}