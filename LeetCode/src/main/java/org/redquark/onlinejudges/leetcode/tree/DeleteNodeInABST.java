package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        // Special case
        if (root == null) {
            return null;
        }
        // Check which subtree we need to traverse
        // If the key is smaller than the root, then we should
        // search in the left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        // If the key is greater than the root, then we should
        // search in the right subtree
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        // If we have found the node to delete
        else {
            // If the node to be delete has only one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // If the node has both children, find the minimum value
            // in the right subtree and delete it
            root.val = minimumValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minimumValue(TreeNode node) {
        int min = node.val;
        while (node.left != null) {
            min = node.left.val;
            node = node.left;
        }
        return min;
    }
}
