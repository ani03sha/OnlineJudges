package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Special case
        if (root == null || root == p || root == q) {
            return root;
        }
        // Recursively call the function for left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // Check if we have reached the given nodes
        if ((left == p && right == q) || (left == q && right == p)) {
            return root;
        }
        return left != null ? left : right;
    }
}
