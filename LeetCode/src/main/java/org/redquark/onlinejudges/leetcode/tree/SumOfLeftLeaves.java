package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Check if the current node is the left leave node
        else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        // Exploring the tree further
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
