package org.redquark.onlinejudges.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class KthLargestElementInAStream {

    static class KthLargest {
        // Min heap to store the k-th element always at the root
        private final Queue<Integer> minHeap;
        // The kth element to be found out
        private final int k;

        public KthLargest(int k, int[] nums) {
            // Initialize the heap
            this.minHeap = new PriorityQueue<>();
            this.k = k;
            // Add the elements in the array to the min heap
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            // Check if the size of the heap is less than the k or not
            if (minHeap.size() < k) {
                minHeap.add(val);
                return minHeap.size() == k ? minHeap.peek() : -1;
            }
            // If the value to be added is greater than the value
            // at the root, we need to add it to the heap
            if (minHeap.peek() != null && val > minHeap.peek()) {
                // Since the new value will shift the k-th the largest
                // element, we will remove the current root and then
                // add the new element
                minHeap.poll();
                minHeap.add(val);
            }
            // This will also execute if the value to be added is less than
            // the value at current root because it won't affect the position
            // of the current root at the k-th the largest element
            return !minHeap.isEmpty() ? minHeap.peek() : -1;
        }
    }
}
