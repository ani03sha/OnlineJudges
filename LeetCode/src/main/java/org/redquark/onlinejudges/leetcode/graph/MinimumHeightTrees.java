package org.redquark.onlinejudges.leetcode.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MinimumHeightTrees {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // List to store the minimum height tree root nodes
        List<Integer> mhtRoots = new ArrayList<>();
        // Special case
        if (n <= 0) {
            return mhtRoots;
        }
        if (n == 1) {
            mhtRoots.add(0);
            return mhtRoots;
        }
        // Array to store the indegrees of the nodes
        int[] indegrees = new int[n];
        // Create the tree from the edges and update the indegrees
        // of each node
        Map<Integer, Set<Integer>> tree = createTree(n, edges, indegrees);
        // Queue to store only those nodes whose indegree is 1
        Queue<Integer> leaves = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegrees[i] == 1) {
                leaves.offer(i);
            }
        }
        // There can be maximum n nodes which are candidates for the
        // MHT roots, but we know that there can be maximum 2 nodes
        // which can be the possible MHT root nodes. Thus, we will
        // check for all leaf nodes (in the queue) and stop our processing
        // when at least two nodes are remaining in the queue
        int mhtRootCount = n;
        while (mhtRootCount > 2) {
            // Perform BFS here
            int leafCount = leaves.size();
            // Update the mhtRootCount as leaves cannot be the MHT root
            // candidates
            mhtRootCount -= leafCount;
            for (int i = 0; i < leafCount; i++) {
                int leaf = leaves.remove();
                // Check for all the neighbors of this leaf
                for (int leafNeighbor : tree.get(leaf)) {
                    indegrees[leafNeighbor]--;
                    if (indegrees[leafNeighbor] == 1) {
                        leaves.offer(leafNeighbor);
                    }
                }
            }
        }
        mhtRoots.addAll(leaves);
        return mhtRoots;
    }

    private Map<Integer, Set<Integer>> createTree(int n, int[][] edges, int[] indegrees) {
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tree.put(i, new HashSet<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree.get(u).add(v);
            tree.get(v).add(u);
            indegrees[u]++;
            indegrees[v]++;
        }
        return tree;
    }
}
