package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DetectCycleInDirectedGraph {

    public boolean isCyclic(ArrayList<Integer>[] adjList) {
        // Special case
        if (adjList == null || adjList.length == 0) {
            return false;
        }
        // Total number of nodes
        int n = adjList.length;
        // Array to store the indegrees of every node
        int[] indegrees = new int[n];
        // Populate the indegrees
        for (ArrayList<Integer> integers : adjList) {
            for (int neighbor : integers) {
                indegrees[neighbor]++;
            }
        }
        // Queue to store with no incoming edges
        Queue<Integer> nodesWithZeroIndegree = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegrees[i] == 0) {
                nodesWithZeroIndegree.offer(i);
            }
        }
        // List to store nodes in topological sort
        List<Integer> topologicalSortedList = new ArrayList<>();
        // Loop until all nodes are traversed
        while (!nodesWithZeroIndegree.isEmpty()) {
            int current = nodesWithZeroIndegree.remove();
            topologicalSortedList.add(current);
            // Loop through the neighbors of the current node
            for (int neighbor : adjList[current]) {
                indegrees[neighbor]--;
                if (indegrees[neighbor] == 0) {
                    nodesWithZeroIndegree.offer(neighbor);
                }
            }
        }
        return topologicalSortedList.size() != n;
    }
}
