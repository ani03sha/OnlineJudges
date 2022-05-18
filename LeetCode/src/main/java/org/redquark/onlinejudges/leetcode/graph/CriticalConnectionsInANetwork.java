package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class CriticalConnectionsInANetwork {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // List to store critical connection node numbers
        List<List<Integer>> criticalNodes = new ArrayList<>();
        // Special case
        if (connections == null || connections.isEmpty()) {
            return criticalNodes;
        }
        // Adjacency list to represent the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (List<Integer> connection : connections) {
            int a = connection.get(0);
            int b = connection.get(1);
            graph.putIfAbsent(a, new ArrayList<>());
            graph.get(a).add(b);
            graph.putIfAbsent(b, new ArrayList<>());
            graph.get(b).add(a);
        }
        // Time taken to reach a node
        int timer = 0;
        // Array to represent time taken to reach a node
        int[] timeTakenToReachANode = new int[n];
        // Boolean array to represent visited nodes
        boolean[] visited = new boolean[n];
        // Perform DFS and update the timer for each node
        dfs(graph, timer, timeTakenToReachANode, visited, criticalNodes, -1, 0);
        return criticalNodes;
    }

    private void dfs(Map<Integer, List<Integer>> graph,
                     int timer,
                     int[] timeTakenToReachANode,
                     boolean[] visited,
                     List<List<Integer>> criticalNodes,
                     int parent,
                     int current) {
        // Mark the current node as visited
        visited[current] = true;
        // Update the time taken to reach the current node
        timeTakenToReachANode[current] = timer++;
        // Current time stamp
        int currentTimeStamp = timeTakenToReachANode[current];
        // Loop for all the neighbors of the current node
        for (int neighbor : graph.get(current)) {
            // If there's a cycle
            if (neighbor == parent) {
                continue;
            }
            if (!visited[neighbor]) {
                dfs(graph, timer, timeTakenToReachANode, visited, criticalNodes, current, neighbor);
            }
            // Update the minimum time stamp at the node
            timeTakenToReachANode[current] = Math.min(timeTakenToReachANode[current], timeTakenToReachANode[neighbor]);
            if (currentTimeStamp < timeTakenToReachANode[neighbor]) {
                criticalNodes.add(Arrays.asList(current, neighbor));
            }
        }
    }
}
