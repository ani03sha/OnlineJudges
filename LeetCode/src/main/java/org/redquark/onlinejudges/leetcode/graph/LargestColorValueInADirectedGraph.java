package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LargestColorValueInADirectedGraph {

    public int largestPathValue(String colors, int[][] edges) {
        // Total number of vertices
        int n = colors.length();
        // List of lists to represent graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Array to keep track of indegree of every vertex
        int[] indegrees = new int[n];
        // Traverse the edges array
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            indegrees[v]++;
            graph.get(u).add(v);
        }
        // Map to keep track of color frequencies. The element colorFrequencies[i][j]
        // represents the maximum count of j-th color from the ancestor nodes to node i.
        int[][] colorFrequencies = new int[n][26];
        // Kahn's Algorithm for iterative topological sort
        // The queue represents all nodes with zero indegree
        Queue<Integer> nodes = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegrees[i] == 0) {
                nodes.offer(i);
                colorFrequencies[i][colors.charAt(i) - 'a']++;
            }
        }
        // Visited node count
        int visited = 0;
        // Largest color value count
        int output = 0;
        // Traverse the queue
        while (!nodes.isEmpty()) {
            int node = nodes.remove();
            visited++;
            // Get maximum color value
            int max = getMaximum(colorFrequencies[node]);
            output = Math.max(output, max);
            // Traverse the neighbors of this node
            for (int neighbor : graph.get(node)) {
                // Update the map of neighbor node
                for (int i = 0; i < 26; i++) {
                    colorFrequencies[neighbor][i] = Math.max(colorFrequencies[neighbor][i],
                            colorFrequencies[node][i] + (colors.charAt(neighbor) - 'a' == i ? 1 : 0));
                }
                indegrees[neighbor]--;
                if (indegrees[neighbor] == 0) {
                    nodes.offer(neighbor);
                }
            }
        }
        // If visited != n, it means cycle is there
        return visited == n ? output : -1;
    }

    private int getMaximum(int[] colorFrequency) {
        int max = colorFrequency[0];
        for (int i = 1; i < colorFrequency.length; i++) {
            max = Math.max(max, colorFrequency[i]);
        }
        return max;
    }
}
