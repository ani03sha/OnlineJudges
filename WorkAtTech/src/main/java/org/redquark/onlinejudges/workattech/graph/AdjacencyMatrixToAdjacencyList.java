package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayList;

public class AdjacencyMatrixToAdjacencyList {

    @SuppressWarnings("unchecked")
    ArrayList<Integer>[] matrixToAdjList(int n, int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0 || n <= 0) {
            return new ArrayList[]{};
        }
        // Adjacency list
        ArrayList<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        // Loop through the adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    adjacencyList[i].add(j);
                }
            }
        }
        return adjacencyList;
    }
}
