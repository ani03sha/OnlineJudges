package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarStringGroups {

    public int numSimilarGroups(String[] strs) {
        // Special case
        if (strs == null || strs.length == 0) {
            return 0;
        }
        // Total number of words
        int n = strs.length;
        // Since this is a graph problem, where every
        // node is connected to a node representing similar
        // word, we will create an adjacency list.
        // In the adjacency list represented by a map,
        // the index of current word is the key and its
        // value is a list of indices of similar words.
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Add to the adjacency list, if words are
                // similar
                if (areSimilar(strs[i], strs[j])) {
                    graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                    graph.computeIfAbsent(j, k -> new ArrayList<>()).add(i);
                }
            }
        }
        // Array to mark the visited nodes
        boolean[] visited = new boolean[n];
        // Count of components in the graph
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
                count++;
            }
        }
        return count;
    }

    private boolean areSimilar(String a, String b) {
        // Count of different characters at indices
        int difference = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                difference++;
            }
        }
        return difference == 0 || difference == 2;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int index, boolean[] visited) {
        // Mark the current node as visited
        visited[index] = true;
        if (!graph.containsKey(index)) {
            return;
        }
        for (int neighbor : graph.get(index)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(graph, neighbor, visited);
            }
        }
    }
}
