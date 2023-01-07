package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSOfAGraph {

    public ArrayList<Integer> bfs(ArrayList<Integer>[] adjList) {
        // List to store the nodes in BFS
        ArrayList<Integer> bfsList = new ArrayList<>();
        // Special case
        if (adjList == null || adjList.length == 0) {
            return bfsList;
        }
        // Total number of nodes
        int n = adjList.length;
        // Array to keep track of the visited nodes
        boolean[] visited = new boolean[n];
        // Queue to perform BFS
        Queue<Integer> nodes = new ArrayDeque<>();
        // Process the root node
        nodes.offer(0);
        visited[0] = true;
        // Loop until the nodes are present in the queue
        while (!nodes.isEmpty()) {
            int current = nodes.remove();
            bfsList.add(current);
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    nodes.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return bfsList;
    }
}
