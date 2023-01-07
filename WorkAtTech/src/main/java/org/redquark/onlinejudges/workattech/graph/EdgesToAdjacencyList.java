package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayList;

public class EdgesToAdjacencyList {

    @SuppressWarnings("unchecked")
    public ArrayList<Integer>[] edgesToAdjList(int n, int[][] edges) {
        // List to represent the adjacency list
        ArrayList<Integer>[] adjList = new ArrayList[n];
        // Add empty lists for eac index
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        // Traverse through all the edges and make the
        // connections
        for (int[] edge : edges) {
            adjList[edge[0]].add(edge[1]);
            if (edge[0] == edge[1]) {
                continue;
            }
            adjList[edge[1]].add(edge[0]);
        }
        return adjList;
    }
}
