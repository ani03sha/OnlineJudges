package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostToConnectAllPointsTest {

    private final MinCostToConnectAllPoints testObject = new MinCostToConnectAllPoints();

    @Test
    public void testMinCostConnectPoints() {
        int[][] points = new int[][]{
                {0, 0},
                {2, 2},
                {3, 10},
                {5, 2},
                {7, 0}
        };
        assertEquals(20, testObject.minCostConnectPoints(points));

        points = new int[][]{
                {3, 12},
                {-2, 5},
                {-4, 1}
        };
        assertEquals(18, testObject.minCostConnectPoints(points));
    }
}