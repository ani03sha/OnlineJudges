package org.redquark.onlinejudges.workattech.graph;

public class EdgesToAdjacencyMatrix {

    public int[][] edgesToMatrix(int n, int[][] edges) {
        // Adjacency matrix
        int[][] adjacencyMatrix = new int[n][n];
        // Loop through the edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1;
        }
        return adjacencyMatrix;
    }
}
