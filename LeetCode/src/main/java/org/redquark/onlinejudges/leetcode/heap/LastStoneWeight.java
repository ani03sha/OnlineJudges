package org.redquark.onlinejudges.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Max heap to store the stones by their weights
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        // Remove stones from the heap until one stone is left
        while (maxHeap.size() != 1) {
            // Get two heaviest stones
            int heaviest = maxHeap.remove();
            int secondHeaviest = maxHeap.remove();
            // Add the difference of two stones in the heap
            // for further calculations
            maxHeap.add(heaviest - secondHeaviest);
        }
        return maxHeap.remove();
    }
}
