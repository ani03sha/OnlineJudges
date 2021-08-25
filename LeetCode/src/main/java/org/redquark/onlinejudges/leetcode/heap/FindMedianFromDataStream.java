package org.redquark.onlinejudges.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class FindMedianFromDataStream {

    static class MedianFinder {
        // Min heap to store the elements from right half
        private final Queue<Integer> minHeap;
        // Max heap to store the elements from left half
        private final Queue<Integer> maxHeap;

        public MedianFinder() {
            minHeap = new PriorityQueue<>();
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            // Compare the sizes of the heaps
            if (maxHeap.size() == minHeap.size()) {
                // Add the element to the max heap
                maxHeap.offer(num);
                // Remove root of max heap and add it to min heap
                minHeap.offer(maxHeap.poll());
            } else {
                // Add the element to the min heap
                minHeap.offer(num);
                // Remove root of min heap and add it to max heap
                maxHeap.offer(minHeap.poll());
            }
        }

        public double findMedian() {
            return minHeap.size() > maxHeap.size()
                    ? minHeap.peek()
                    : (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }
}
