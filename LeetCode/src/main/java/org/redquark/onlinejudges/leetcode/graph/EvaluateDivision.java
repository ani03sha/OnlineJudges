package org.redquark.onlinejudges.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Map to store the nodes and edges of the weighted directed graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        // Total number of queries
        int n = queries.size();
        // Array to store the output of queries
        double[] output = new double[n];
        // Create graph
        createGraph(equations, values, graph);
        // Evaluate queries
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            // Set to store visited nodes
            Set<String> visited = new HashSet<>();
            output[i] = evaluateByDFS(graph, visited, start, end);
        }
        return output;
    }

    private double evaluateByDFS(Map<String, Map<String, Double>> graph, Set<String> visited, String start, String end) {
        // If the start doesn't exist, we return -1.0
        if (!graph.containsKey(start)) {
            return -1.0;
        }
        // If we have found the direct edge between start and
        // end node, we will return the weight
        if (graph.get(start).containsKey(end)) {
            return graph.get(start).get(end);
        }
        // Mark start node as visited
        visited.add(start);
        // Loop through all the neighbors of the current node
        // until we reach to the end
        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            // Check if the node is unvisited
            if (!visited.contains(neighbor.getKey())) {
                double weight = evaluateByDFS(graph, visited, neighbor.getKey(), end);
                if (weight != -1.0) {
                    return neighbor.getValue() * weight;
                }
            }
        }
        return -1.0;
    }

    private void createGraph(List<List<String>> equations, double[] values, Map<String, Map<String, Double>> graph) {
        // Loop through the equations list
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.get(v).put(u, 1 / values[i]);
        }
    }
}
