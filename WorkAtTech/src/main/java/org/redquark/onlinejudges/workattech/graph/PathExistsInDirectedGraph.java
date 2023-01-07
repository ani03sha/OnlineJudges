package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PathExistsInDirectedGraph {

    public boolean pathExists(ArrayList<Integer>[] adjList) {
        // Special case
        if (adjList == null || adjList.length == 0) {
            return false;
        }
        // Total number of nodes
        int n = adjList.length;
        // Queue to perform BFS
        Queue<Integer> nodes = new ArrayDeque<>();
        // Array to store visited nodes
        boolean[] visited = new boolean[n];
        // Add root node to the queue
        nodes.offer(0);
        // Mark the root node as visited
        visited[0] = true;
        // Loop until the queue has nodes
        while (!nodes.isEmpty()) {
            // Get the current node
            int node = nodes.remove();
            // Loop through the neighbors of this node
            for (int neighbor : adjList[node]) {
                if (neighbor == n - 1) {
                    return true;
                }
                if (!visited[neighbor]) {
                    nodes.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return false;
    }
}
