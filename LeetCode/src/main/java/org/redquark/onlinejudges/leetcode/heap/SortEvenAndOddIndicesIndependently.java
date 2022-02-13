package org.redquark.onlinejudges.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class SortEvenAndOddIndicesIndependently {

    public int[] sortEvenOdd(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Create two heaps - max heap for odd elements
        // and min heap for even elements
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add elements to the heap
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                minHeap.add(nums[i]);
            } else {
                maxHeap.add(nums[i]);
            }
        }
        // Loop through all elements in the heap
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && !minHeap.isEmpty()) {
                nums[i] = minHeap.poll();
            } else if (i % 2 == 1 && !maxHeap.isEmpty()) {
                nums[i] = maxHeap.poll();
            }
        }
        return nums;
    }
}
