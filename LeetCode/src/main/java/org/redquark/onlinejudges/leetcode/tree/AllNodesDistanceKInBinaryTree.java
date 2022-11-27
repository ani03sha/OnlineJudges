package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AllNodesDistanceKInBinaryTree {

    /**
     * Time complexity - O(n)
     * Space complexity - (n)
     */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // List to store the k-distanced nodes
        List<Integer> kDistancedNodes = new ArrayList<>();
        // Special case
        if (root == null || target == null) {
            return kDistancedNodes;
        }
        // Convert the tree into an undirected graph where
        // vertices are the nodes of the tree and edges are
        // the parent child relationships
        final Map<TreeNode, Set<TreeNode>> graph = new HashMap<>();
        convertTreeToGraph(root, null, graph);
        // Check if the target node is present in the graph
        if (!graph.containsKey(target)) {
            return kDistancedNodes;
        }
        // Perform BFS from the target node from here
        final Queue<TreeNode> nodes = new ArrayDeque<>();
        // Set to keep track of visited nodes
        final Set<TreeNode> visited = new HashSet<>();
        // Add root to the queue and visited set
        nodes.offer(target);
        visited.add(target);
        // Loop until the queue is not empty
        while (!nodes.isEmpty()) {
            // Get the nodes at the current level
            int size = nodes.size();
            // Check if the k has reached to zero
            if (k == 0) {
                for (int i = 0; i < size; i++) {
                    kDistancedNodes.add(nodes.remove().val);
                }
                return kDistancedNodes;
            }
            for (int i = 0; i < size; i++) {
                // Get the current node
                TreeNode current = nodes.remove();
                // For the neighbors of this node
                for (TreeNode neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        nodes.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
            k--;
        }
        return kDistancedNodes;
    }

    private void convertTreeToGraph(TreeNode currentNode, TreeNode parentNode, Map<TreeNode, Set<TreeNode>> graph) {
        if (currentNode == null) {
            return;
        }
        if (!graph.containsKey(currentNode)) {
            graph.put(currentNode, new HashSet<>());
            if (parentNode != null) {
                graph.get(currentNode).add(parentNode);
                graph.get(parentNode).add(currentNode);
            }
            convertTreeToGraph(currentNode.left, currentNode, graph);
            convertTreeToGraph(currentNode.right, currentNode, graph);
        }
    }
}
