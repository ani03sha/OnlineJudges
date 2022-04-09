package org.redquark.onlinejudges.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length < k) {
            throw new IllegalArgumentException("Invalid input!");
        }
        // Map to store the frequencies of the elements
        // in the array
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Populate the map
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 1) + 1);
        }
        // We will create a max heap that will store the elements
        // according to their frequencies
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> frequencies.get(b) - frequencies.get(a));
        // Add all the elements in the map to this heap
        maxHeap.addAll(frequencies.keySet());
        // Array to store the final output
        int[] result = new int[k];
        // Populate the array
        int index = 0;
        while (index < k) {
            result[index] = maxHeap.remove();
            index++;
        }
        return result;
    }
}
