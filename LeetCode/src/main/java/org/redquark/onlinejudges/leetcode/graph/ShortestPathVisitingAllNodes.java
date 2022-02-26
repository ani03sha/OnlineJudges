package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ShortestPathVisitingAllNodes {

    public int shortestPathLength(int[][] graph) {
        // Special case
        if (graph == null || graph.length == 0) {
            throw new IllegalArgumentException("Graph doesn't exist");
        }
        // Number of nodes in the graph
        int n = graph.length;
        // Map to store the adjacency list
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        // Populate this map
        for (int i = 0; i < n; i++) {
            if (!adjacencyMap.containsKey(i)) {
                adjacencyMap.put(i, new ArrayList<>());
            }
            for (int j = 0; j < graph[i].length; j++) {
                adjacencyMap.get(i).add(graph[i][j]);
            }
        }
        // Since we cannot maintain the visited array here because the
        // problem states that we can visit any node and edge any number
        // of times but if we don't do it then there may be a case which
        // can cause us to move in cycles.
        // To counter this, we will maintain a 2D array pattern[mask][node]
        // where mask is the combination of set of nodes which are visited
        // and node is the individual node.
        int[][] pattern = new int[(1 << n)][n];
        // Fill the array pattern with default values
        Arrays.stream(pattern).forEach(p -> Arrays.fill(p, -1));
        // Queue that will store the mapping of node and mask
        Queue<int[]> nodeMask = new LinkedList<>();
        // Populate the queue
        for (int i = 0; i < n; i++) {
            int mask = setBit(0, i);
            nodeMask.add(new int[]{i, mask});
            pattern[mask][i] = 0;
        }
        // Applying BFS
        while (!nodeMask.isEmpty()) {
            // Get the nodes at the current level
            int size = nodeMask.size();
            for (int i = 0; i < size; i++) {
                // Get current path
                int[] path = nodeMask.poll();
                if (path != null) {
                    int node = path[0];
                    int mask = path[1];
                    // If all the nodes are visited
                    if (mask == (1 << n) - 1) {
                        return pattern[mask][node];
                    }
                    // Iterate neighbor nodes
                    if (adjacencyMap.containsKey(node)) {
                        for (int neighbor : adjacencyMap.get(node)) {
                            int newMask = setBit(mask, neighbor);
                            // Avoid cycle by checking if this path is
                            // already visited
                            if (pattern[newMask][neighbor] != -1) {
                                continue;
                            }
                            pattern[newMask][neighbor] = pattern[mask][node] + 1;
                            nodeMask.offer(new int[]{neighbor, newMask});
                        }
                    }
                }
            }
        }
        // If we reach here, it means no path is present
        throw new IllegalStateException("No path exists");
    }

    private int setBit(int mask, int node) {
        return mask | (1 << node);
    }
}
