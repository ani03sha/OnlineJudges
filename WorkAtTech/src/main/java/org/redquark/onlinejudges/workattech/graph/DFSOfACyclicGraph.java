package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayList;

public class DFSOfACyclicGraph {

    public ArrayList<Integer> dfs(ArrayList<Integer>[] adjList) {
        // List to store DFS
        ArrayList<Integer> dfsList = new ArrayList<>();
        // Special case
        if (adjList == null || adjList.length == 0) {
            return dfsList;
        }
        // Total number of nodes
        int n = adjList.length;
        // Array to store the visited nodes
        boolean[] visited = new boolean[n];
        // Perform DFS traversal
        dfs(adjList, visited, 0, dfsList);
        return dfsList;
    }

    private void dfs(ArrayList<Integer>[] adjList, boolean[] visited, int current, ArrayList<Integer> dfsList) {
        // Add current node to the traversal list
        dfsList.add(current);
        visited[current] = true;
        // Loop through the neighbors of the current node
        for (int neighbor : adjList[current]) {
            if (!visited[neighbor]) {
                dfs(adjList, visited, neighbor, dfsList);
            }
        }
    }
}
