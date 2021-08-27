package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        // Base case
        if (root == null) {
            return true;
        }
        // Check if BST property is violated
        if ((root.left != null && root.left.val > root.val) || (root.right != null && root.right.val < root.val)) {
            return false;
        }
        // Recursively check for left and right subtrees
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
