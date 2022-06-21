package org.redquark.onlinejudges.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class FurthestBuildingYouCanReach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // Priority queue to store the difference between heights
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Loop through the heights
        for (int i = 0; i < heights.length - 1; i++) {
            // Get the difference of two adjacent buildings
            int difference = heights[i + 1] - heights[i];
            // If the difference is greater than zero,
            // then we can use ladders, if available
            if (difference > 0) {
                minHeap.add(difference);
            }
            if (minHeap.size() > ladders) {
                bricks -= minHeap.poll();
            }
            // If there are no bricks
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}
