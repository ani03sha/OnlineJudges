package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class PathSum {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Special cases
        if (root == null) {
            return false;
        }
        // Subtract current root's value from the targetSum
        targetSum -= root.val;
        // Check if the current root is the leaft node and if
        // we have made target sum as 0
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        // Recurse on the left and right subtrees
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
