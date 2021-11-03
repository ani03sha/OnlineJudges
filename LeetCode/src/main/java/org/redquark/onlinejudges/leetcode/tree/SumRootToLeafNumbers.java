package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum) {
        // Base condition
        if (root == null) {
            return 0;
        }
        // Update the sum
        sum = sum * 10 + root.val;
        // If the current node is the leaf node
        if (root.left == null && root.right == null) {
            return sum;
        }
        // Recurse for left and right subtrees
        return helper(root.left, sum) + helper(root.right, sum);
    }
}
