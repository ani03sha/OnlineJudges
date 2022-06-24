package org.redquark.onlinejudges.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ConstructTargetArrayWithMultipleSums {

    public boolean isPossible(int[] target) {
        // Special case
        if (target == null || target.length == 0) {
            return false;
        }
        // Priority queue (max heap) to store items of array
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        // Cumulative sum of all the elements in the queue
        int cumulativeSum = 0;
        // Loop through every element in the array and store it in the heap
        for (int t : target) {
            maxHeap.add(t);
            cumulativeSum += t;
        }
        // Loop until the queue is empty
        while (maxHeap.peek() != null && maxHeap.peek() != 1) {
            // Get the root of the heap
            int root = maxHeap.poll();
            // Subtract this from the cumulative sum
            cumulativeSum -= root;
            // Base case
            if (root <= cumulativeSum || cumulativeSum < 1) {
                return false;
            }
            root %= cumulativeSum;
            cumulativeSum += root;
            maxHeap.add(root > 0 ? root : cumulativeSum);
        }
        return true;
    }
}
