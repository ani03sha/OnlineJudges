package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int minDepth(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Variable to keep track of minimum depth
        int minimumDepth = 0;
        // Queue to store nodes in BFS
        final Queue<TreeNode> nodes = new LinkedList<>();
        // Add the root node to the queue
        nodes.offer(root);
        // Loop until we reach the minimum depth
        while (!nodes.isEmpty()) {
            minimumDepth++;
            // Size of the queue - nodes at the current level
            int size = nodes.size();
            // Traverse through the current level
            for (int i = 0; i < size; i++) {
                // Get the node at the front of the queue
                TreeNode node = nodes.remove();
                // If both children of this node are null, then
                // we have encountered the leaf node and we will
                // return the minimum depth
                if (node.left == null && node.right == null) {
                    return minimumDepth;
                }
                // Add non null children of the node to the queue
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
        }
        // The code will never reach here
        return minimumDepth;
    }
}
