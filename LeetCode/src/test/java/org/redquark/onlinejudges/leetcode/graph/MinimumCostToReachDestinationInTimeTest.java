package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCostToReachDestinationInTimeTest {

    private final MinimumCostToReachDestinationInTime testObject = new MinimumCostToReachDestinationInTime();

    @Test
    public void testMinCost() {
        int maxTime = 30;
        int[][] edges = new int[][]{
                {0, 1, 10},
                {1, 2, 10},
                {2, 5, 10},
                {0, 3, 1},
                {3, 4, 10},
                {4, 5, 15}
        };
        int[] passingFees = new int[]{5, 1, 2, 20, 20, 3};
        assertEquals(11, testObject.minCost(maxTime, edges, passingFees));

        maxTime = 29;
        assertEquals(48, testObject.minCost(maxTime, edges, passingFees));

        maxTime = 25;
        assertEquals(-1, testObject.minCost(maxTime, edges, passingFees));
    }
}