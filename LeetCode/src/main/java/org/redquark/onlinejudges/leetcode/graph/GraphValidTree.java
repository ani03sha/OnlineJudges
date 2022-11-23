package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphValidTree {

    /**
     * Time complexity - O(V + E)
     * Space complexity - O(V + E)
     */
    public boolean validTree(int n, int[][] edges) {
        // Special cases
        if (n < 0 || edges == null || edges.length == 0 || edges.length != n - 1) {
            return false;
        }
        // Create the graph from the given vertices and edges
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        // Create vertices
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        // Create edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // Queue for the BFS traversal of the graph
        Queue<Integer> nodes = new ArrayDeque<>();
        // Set to represent visited nodes
        Set<Integer> visited = new HashSet<>();
        // Add the first node to the queue and the visited set
        nodes.offer(0);
        visited.add(0);
        // Loop until we traverse all the nodes
        while (!nodes.isEmpty()) {
            // Get the current node
            int node = nodes.remove();
            // Check the neighbors of the current node
            for (int neighbor : graph.get(node)) {
                // Check if this node has already been visited
                // If so, it means a cycle is found.
                if (visited.contains(neighbor)) {
                    continue;
                }
                // Add the neighbor to the visited set
                visited.add(neighbor);
                // Add neighbor to the queue for further traversal
                nodes.offer(neighbor);
            }
        }
        // If the size of the visited node is equal to the number of nodes
        // in the graph it means there is no disconnected node
        return visited.size() == n;
    }
}
