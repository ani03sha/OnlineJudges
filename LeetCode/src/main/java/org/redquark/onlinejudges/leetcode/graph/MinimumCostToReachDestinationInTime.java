package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class MinimumCostToReachDestinationInTime {

    @SuppressWarnings("unchecked")
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        // Special case
        if (maxTime <= 0 || edges == null || edges.length == 0 || passingFees == null || passingFees.length == 0) {
            return -1;
        }
        // Total cities
        int n = passingFees.length;
        // Array to store the minimum time taken to reach a city
        int[] minimumTimes = new int[n];
        // Populate the array with default values
        Arrays.fill(minimumTimes, Integer.MAX_VALUE);
        // Array of lists to represent the graph
        List<int[]>[] graph = new List[n];
        // Initialize the array
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        // Populate the graph
        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
            graph[edge[1]].add(new int[]{edge[0], edge[2]});
        }
        // Create a min heap that will store objects based on the minimum fees
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        // Add the source in the heap - node index, passing fees and time spent till here
        minHeap.offer(new int[]{0, passingFees[0], 0});
        // Loop until we have nodes present
        while (!minHeap.isEmpty()) {
            // Current node
            int[] current = minHeap.poll();
            // Current node
            int currentNode = current[0];
            // Current fees
            int currentFees = current[1];
            // Current time
            int currentTime = current[2];
            // If the current time is greater than or equal to the minimum
            // time for this node, or it is greater than the maxTime, then we
            // will skip this route
            if (currentTime >= minimumTimes[currentNode] || currentTime > maxTime) {
                continue;
            }
            // If we have reached the last node, just return the fees
            if (currentNode == n - 1) {
                return currentFees;
            }
            // Update the minimum time for this node
            minimumTimes[currentNode] = currentTime;
            // Traverse the neighbors of the current node
            for (int[] g : graph[currentNode]) {
                minHeap.offer(new int[]{g[0], currentFees + passingFees[g[0]], currentTime + g[1]});
            }
        }
        return -1;
    }
}
