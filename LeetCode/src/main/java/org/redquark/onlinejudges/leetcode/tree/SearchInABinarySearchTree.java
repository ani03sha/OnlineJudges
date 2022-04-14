package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        // Node to traverse through the tree
        TreeNode cursor = root;
        // Traverse the tree until the target value is not found
        while (cursor != null && cursor.val != val) {
            // If the target value is less than the value
            // at the current node, then we move to the
            // left subtree, else to the right subtree
            cursor = val < cursor.val ? cursor.left : cursor.right;
        }
        return cursor;
    }
}
