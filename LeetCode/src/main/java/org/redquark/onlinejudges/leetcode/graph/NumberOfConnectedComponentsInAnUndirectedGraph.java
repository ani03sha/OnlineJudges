package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class NumberOfConnectedComponentsInAnUndirectedGraph {

    /**
     * Time complexity - O(V + E)
     * Space complexity - O(V)
     */
    public int countComponents(int n, int[][] edges) {
        // Special case
        if (n < 0 || edges == null || edges.length == 0) {
            return 0;
        }
        // Count of connected components
        int connectedComponentCount = 0;
        // Create graph (adjacency list)
        Map<Integer, Set<Integer>> graph = createGraph(n, edges);
        // Set to represent visited nodes
        boolean[] visited = new boolean[n];
        // Loop for all the nodes
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // Mark this node as the visited node
                connectedComponentCount++;
                // Queue for the BFS traversal of the graph
                Queue<Integer> nodes = new ArrayDeque<>();
                nodes.offer(i);
                // Loop for all the neighbors of this node
                while (!nodes.isEmpty()) {
                    // Get the current node to process
                    int node = nodes.remove();
                    // Mark this node as visited
                    visited[node] = true;
                    for (int neighbor : graph.get(node)) {
                        if (!visited[neighbor]) {
                            nodes.offer(neighbor);
                        }
                    }
                }
            }
        }
        return connectedComponentCount;
    }

    private Map<Integer, Set<Integer>> createGraph(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
}
