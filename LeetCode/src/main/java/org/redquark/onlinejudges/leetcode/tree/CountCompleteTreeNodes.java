package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Get the left height and right height of the tree
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        // If both heights are equal, then given tree is a full tree
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            node = node.left;
            height++;
        }
        return height;
    }

    private int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            node = node.right;
            height++;
        }
        return height;
    }
}
