package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class TrimABinarySearchTree {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        // Special case
        if (root == null) {
            return null;
        }
        // If the value at current node is less than the
        // value of low, we will discard the left subtree
        // of the current node and consider only the right
        // subtree of the current node
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        // If the value at current node is greater than the
        // value of high, we will discard the right subtree
        // of the current node and consider only the left
        // subtree of the current node
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        // When we reach here the value at the current node is
        // in between the range, so we will call make the
        // recursive call with the left and right subtrees
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
