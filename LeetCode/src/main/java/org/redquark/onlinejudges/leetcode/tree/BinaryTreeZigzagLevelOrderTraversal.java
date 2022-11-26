package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List to store the level order traversal
        List<List<Integer>> traversal = new ArrayList<>();
        // Special case
        if (root == null) {
            return traversal;
        }
        // Queue to perform the BFS
        Queue<TreeNode> nodes = new ArrayDeque<>();
        // Add the root node to the queue
        nodes.offer(root);
        // Variable to keep track of current node
        int currentLevel = 0;
        // Loop until we traverse all the nodes
        while (!nodes.isEmpty()) {
            // Get the count of nodes at the current level
            int size = nodes.size();
            List<Integer> currentLevelNodes = new ArrayList<>();
            // Traverse all nodes at the current level
            for (int i = 0; i < size; i++) {
                // Get the current node
                TreeNode currentNode = nodes.remove();
                if (currentLevel % 2 == 0) {
                    // Add this node to the current level nodes list
                    currentLevelNodes.add(currentNode.val);
                } else {
                    currentLevelNodes.add(0, currentNode.val);
                }
                // Check for the left and right children of this node
                if (currentNode.left != null) {
                    nodes.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    nodes.offer(currentNode.right);
                }
            }
            // Add current level nodes to the final list
            traversal.add(currentLevelNodes);
            currentLevel++;
        }
        return traversal;
    }
}
