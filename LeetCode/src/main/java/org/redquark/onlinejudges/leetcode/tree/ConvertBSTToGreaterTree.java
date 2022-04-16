package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class ConvertBSTToGreaterTree {

    private int sum;

    public TreeNode convertBST(TreeNode root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Values greater than the current node will only
        // be present in the right subtree, so we will recur
        // for the right subtree of the current node
        convertBST(root.right);
        // Add the value of previously calculated sum to the
        // value of the current node and set it there
        root.val += this.sum;
        // Update the value of sum
        this.sum = root.val;
        // Recur for left subtree
        convertBST(root.left);
        return root;
    }
}
