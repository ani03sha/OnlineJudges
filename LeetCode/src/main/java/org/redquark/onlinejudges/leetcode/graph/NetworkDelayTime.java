package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class NetworkDelayTime {

    public int networkDelayTimeWithDFS(int[][] times, int n, int k) {
        // Special cases
        if (k <= 0 || k > n || times == null || times.length == 0) {
            return -1;
        }
        // Adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        // Populate the map
        for (int[] time : times) {
            graph.putIfAbsent(time[0], new ArrayList<>());
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }
        // Sort the edges connecting to every node
        for (int vertex : graph.keySet()) {
            graph.get(vertex).sort(Comparator.comparingInt(a -> a[0]));
        }
        // Array to store the time when the signal is received first
        // to a node represented by array index
        int[] firstSignalReceived = new int[n + 1];
        Arrays.fill(firstSignalReceived, Integer.MAX_VALUE);
        // Perform DFS on the graph
        dfs(graph, firstSignalReceived, k, 0);
        int timeTaken = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            timeTaken = Math.max(timeTaken, firstSignalReceived[i]);
        }
        return timeTaken == Integer.MAX_VALUE ? -1 : timeTaken;
    }

    private void dfs(Map<Integer, List<int[]>> graph, int[] firstSignalReceived, int currentNode, int currentTime) {
        // If the time is greater than or equal to the first
        // signal received at this node, we don't have to
        // perform DFS.
        if (currentTime >= firstSignalReceived[currentNode]) {
            return;
        }
        // Fastest signal time for this node
        firstSignalReceived[currentNode] = currentTime;
        // If we don't have the mapping
        if (!graph.containsKey(currentNode)) {
            return;
        }
        // Check for neighbors
        for (int[] neighbor : graph.get(currentNode)) {
            dfs(graph, firstSignalReceived, neighbor[0], currentTime + neighbor[1]);
        }
    }
}
