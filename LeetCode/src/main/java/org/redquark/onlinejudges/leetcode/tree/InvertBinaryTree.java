package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n) - stack space
     * n being the number of nodes in the tree
     */
    public TreeNode invertTreeRecursive(TreeNode root) {
        // Special cases
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        // Get left and right children of the current node
        TreeNode leftChild = root.left;
        TreeNode rightChild = root.right;
        // Swap the children's places
        root.right = leftChild;
        root.left = rightChild;
        // Recurse for subtrees
        invertTreeRecursive(root.left);
        invertTreeRecursive(root.right);
        return root;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     * n being the number of nodes in the tree
     */
    public TreeNode invertTreeIterative(TreeNode root) {
        // Special cases
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        // Queue to perform BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root node to the queue
        nodes.add(root);
        // Loop until the queue becomes empty
        while (!nodes.isEmpty()) {
            // Get the current noe
            TreeNode current = nodes.poll();
            // Get left and right children of the current node
            TreeNode leftChild = current.left;
            TreeNode rightChild = current.right;
            // Swap the children's places
            current.right = leftChild;
            current.left = rightChild;
            // Add left and right children to the queue for further processing
            if (current.left != null) {
                nodes.offer(current.left);
            }
            if (current.right != null) {
                nodes.offer(current.right);
            }
        }
        return root;
    }
}
