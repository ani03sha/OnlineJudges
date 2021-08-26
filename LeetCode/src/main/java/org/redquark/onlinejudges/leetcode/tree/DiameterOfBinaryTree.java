package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        Height height = new Height();
        return diameterOfBinaryTree(root, height);
    }

    private int diameterOfBinaryTree(TreeNode node, Height height) {
        // Height of left subtree
        Height leftHeight = new Height();
        // Height of right subtree
        Height rightHeight = new Height();
        // Base condition
        if (node == null) {
            height.h = 0;
            return 0;
        }
        // Left and right diameters
        int leftDiameter = diameterOfBinaryTree(node.left, leftHeight);
        int rightDiameter = diameterOfBinaryTree(node.right, rightHeight);
        // Height of current node is max of heights of left subtree and right
        // subtrees plus one
        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;
        return Math.max(leftHeight.h + rightHeight.h, Math.max(leftDiameter, rightDiameter));
    }

    private static class Height {
        private int h;
    }
}
