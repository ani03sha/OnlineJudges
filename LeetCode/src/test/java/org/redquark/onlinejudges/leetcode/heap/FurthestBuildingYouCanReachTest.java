package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FurthestBuildingYouCanReachTest {

    private final FurthestBuildingYouCanReach testObject = new FurthestBuildingYouCanReach();

    @Test
    public void testFurthestBuilding() {
        int[] heights = new int[]{4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        assertEquals(4, testObject.furthestBuilding(heights, bricks, ladders));

        heights = new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19};
        bricks = 10;
        ladders = 2;
        assertEquals(7, testObject.furthestBuilding(heights, bricks, ladders));
    }
}