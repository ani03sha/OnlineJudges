package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LongestZigZagPathInABinaryTree {

    public int longestZigZag(TreeNode root) {
        // Special case
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        // Queue to perform BFS on the tree
        Queue<Metadata> nodes = new ArrayDeque<>();
        // Process children of root
        if (root.left != null) {
            nodes.offer(new Metadata(root.left, 'L', 1));
        }
        if (root.right != null) {
            nodes.offer(new Metadata(root.right, 'R', 1));
        }
        // Variable to keep track of maximum length
        int maxLength = 0;
        // Traverse through the tree
        while (!nodes.isEmpty()) {
            // Get the node from the front
            Metadata metadata = nodes.remove();
            TreeNode node = metadata.node;
            char direction = metadata.direction;
            int length = metadata.length;
            // Update maxLength, if required
            maxLength = Math.max(maxLength, length);
            // Check for left and right child of the current node
            if (node.left != null) {
                if (direction == 'L') {
                    nodes.offer(new Metadata(node.left, 'L', 1));
                } else {
                    nodes.offer(new Metadata(node.left, 'L', length + 1));
                }
            }
            if (node.right != null) {
                if (direction == 'R') {
                    nodes.offer(new Metadata(node.right, 'R', 1));
                } else {
                    nodes.offer(new Metadata(node.right, 'R', length + 1));
                }
            }
        }
        return maxLength;
    }

    static class Metadata {
        TreeNode node;
        char direction;
        int length;

        Metadata(TreeNode node, char direction, int length) {
            this.node = node;
            this.direction = direction;
            this.length = length;
        }
    }
}
