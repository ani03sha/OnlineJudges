package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayList;

public class AdjacencyListToAdjacencyMatrix {

    public int[][] adjListToMatrix(int n, ArrayList<Integer>[] adjList) {
        // Special case
        if (adjList == null || adjList.length == 0 || n <= 0) {
            return new int[][]{};
        }
        // Array to store adjacency matrix
        int[][] adjacencyMatrix = new int[n][n];
        // Loop through the adjacency list
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> currentAdjacencyList = adjList[i];
            for (int neighbor : currentAdjacencyList) {
                adjacencyMatrix[i][neighbor] = 1;
            }
        }
        return adjacencyMatrix;
    }
}
