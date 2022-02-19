package org.redquark.onlinejudges.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class MinimizeDeviationInArray {

    public int minimumDeviation(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Max heap to store the values
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Minimum number in the array
        int min = Integer.MAX_VALUE;
        // Since we can multiply any odd number by 2 only once,
        // we will convert all odd numbers to the even numbers
        for (int num : nums) {
            if (num % 2 == 1) {
                num *= 2;
            }
            maxHeap.offer(num);
            min = Math.min(min, num);
        }
        // Maximum of all the values
        int difference = Integer.MAX_VALUE;
        // Loop through the heap until the top becomes an odd number
        while (!maxHeap.isEmpty() && maxHeap.peek() % 2 == 0) {
            // Max value will be at the top of the heap
            int max = maxHeap.poll();
            // Difference
            difference = Math.min(difference, max - min);
            // Since top is an even number until at this point,
            // it is possible to halve it which will reduce
            // smaller difference
            min = Math.min(max / 2, min);
            // Add halved value to heap
            maxHeap.offer(max / 2);
        }
        return !maxHeap.isEmpty() ? Math.min(difference, maxHeap.peek() - min) : difference;
    }
}
