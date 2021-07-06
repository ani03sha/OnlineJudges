package org.redquark.onlinejudges.leetcode.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ReduceArraySizeToTheHalf {

    public int minSetSize(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Map to store the frequencies of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Populate this map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Create a max heap based on frequency
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Store all the values in the heap
        maxHeap.addAll(frequencyMap.values());
        // Count of elements to be removed
        int count = 0;
        // Sum of frequencies
        int sum = 0;
        while (!maxHeap.isEmpty() && sum < n / 2) {
            sum += maxHeap.poll();
            count++;
        }
        return count;
    }
}
