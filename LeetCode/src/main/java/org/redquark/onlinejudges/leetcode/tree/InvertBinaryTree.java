package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // Base case
        if (root == null) {
            return null;
        }
        // Get the left and right subtrees of the current node
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // Swap the subtrees
        root.right = left;
        root.left = right;
        return root;
    }
}
