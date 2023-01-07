package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DetectCycleInUndirectedGraph {

    public boolean isCyclic(ArrayList<Integer>[] adjList) {
        // Special case
        if (adjList == null || adjList.length == 0) {
            return false;
        }
        // Total number of nodes
        int n = adjList.length;
        // Array to store visited nodes
        boolean[] visited = new boolean[n];
        // Traverse for each node in the graph
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (checkForCycle(adjList, i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkForCycle(ArrayList<Integer>[] adjList, int current, boolean[] visited) {
        // Queue to perform BFS traversal.
        // The queue will store the node and its
        // parent node
        Queue<int[]> nodes = new ArrayDeque<>();
        // Process the root node
        visited[current] = true;
        nodes.offer(new int[]{current, -1});
        // Process all nodes in the graph
        while (!nodes.isEmpty()) {
            int[] pair = nodes.remove();
            int currentNode = pair[0];
            int currentParent = pair[1];
            for (int neighbor : adjList[currentNode]) {
                if (visited[neighbor] && neighbor != currentParent) {
                    return true;
                }
                if (visited[neighbor] && neighbor == currentParent) {
                    continue;
                }
                if (!visited[neighbor]) {
                    nodes.offer(new int[]{neighbor, currentNode});
                    visited[neighbor] = true;
                }
            }
        }
        return false;
    }
}
