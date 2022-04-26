package org.redquark.onlinejudges.leetcode.graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class MinCostToConnectAllPoints {

    public int minCostConnectPoints(int[][] points) {
        // Special case
        if (points == null || points.length == 0) {
            return 0;
        }
        // Total number of points
        int n = points.length;
        // Variable to keep track of the minimum cost
        int cost = 0;
        // Min heap to store the mappings based on the weights
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // Boolean array to mark visited nodes
        boolean[] visited = new boolean[n];
        // Add the pair of weight and the node in the heap
        minHeap.add(new int[]{0, 0});
        // Pointer to keep track of the edges traversed
        int edgeCount = 0;
        // Loop over all the edges
        while (edgeCount < n) {
            // Get the current node and weight from the root
            // of the heap
            int[] data = minHeap.poll();
            int weight = data[0];
            int currentNode = data[1];
            // If the current node is not visited, then only
            // we will traverse it
            if (!visited[currentNode]) {
                // Mark the current node as visited
                visited[currentNode] = true;
                // Update edge count
                edgeCount++;
                // Update the cost
                cost += weight;
                // Find the next node
                for (int nextNode = 0; nextNode < n; nextNode++) {
                    if (!visited[nextNode]) {
                        // Calculate weight by finding manhattan distance
                        int newWeight = Math.abs(points[currentNode][0] - points[nextNode][0])
                                + Math.abs(points[currentNode][1] - points[nextNode][1]);
                        // Add this to heap
                        minHeap.add(new int[]{newWeight, nextNode});
                    }
                }
            }
        }
        return cost;
    }
}
