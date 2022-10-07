package org.redquark.onlinejudges.leetcode.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(n)
     */
    public int[][] kClosestBruteForce(int[][] points, int k) {
        // Special case
        if (points == null || points.length == 0) {
            return points;
        }
        // Map to store the index and distance of each point
        // from the origin
        Map<Integer, Integer> mappings = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < points.length; i++) {
            // Squared distance
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            mappings.put(i, distance);
        }
        // Store the entries of mappings in a list
        List<Map.Entry<Integer, Integer>> values = new LinkedList<>(mappings.entrySet());
        // Sort the list
        values.sort(Comparator.comparingInt(Map.Entry::getValue));
        // Array to store k closes points
        int[][] kClosestPoints = new int[k][2];
        // Find k-closest points
        for (int i = 0; i < k; i++) {
            kClosestPoints[i] = points[values.get(i).getKey()];
        }
        return kClosestPoints;
    }

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(n)
     */
    public int[][] kClosestCleaner(int[][] points, int k) {
        // Special case
        if (points == null || points.length == 0) {
            return points;
        }
        // Min heap based on distance
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1]));
        // Add all points to this heap
        Collections.addAll(minHeap, points);
        // Array to store k-closest points
        int[][] kClosestPoints = new int[k][2];
        // Index for kClosestPoints array
        int index = 0;
        while (k > 0) {
            kClosestPoints[index] = minHeap.remove();
            k--;
            index++;
        }
        return kClosestPoints;
    }
}
