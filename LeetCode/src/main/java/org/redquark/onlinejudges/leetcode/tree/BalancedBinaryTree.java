package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class BalancedBinaryTree {

    /**
     * Time complexity - O(n^2)
     * Space complexity - O(n)
     */
    public boolean isBalancedBruteForce(TreeNode root) {
        // Special case - if the root is null, then the tree
        // is balanced
        if (root == null) {
            return true;
        }
        // Calculate the difference between the heights of the
        // left and right subtrees
        int heightDifference = Math.abs(calculateHeight(root.left) - calculateHeight(root.right));
        // If the height difference is greater than 1, the tree is
        // not height balanced
        if (heightDifference > 1) {
            return false;
        }
        // Recurse for the left and right subtrees
        return isBalancedBruteForce(root.left) && isBalancedBruteForce(root.right);
    }

    private int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean isBalancedOptimal(TreeNode root) {
        return calculateHeightOptimal(root) != -1;
    }

    private int calculateHeightOptimal(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Recursively compare the height balance condition
        // for the left and the right subtrees
        int leftHeight = calculateHeightOptimal(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = calculateHeightOptimal(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        // If the height difference is greater than 1, we would
        // say that the tree is not height balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
