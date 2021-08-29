package org.redquark.onlinejudges.leetcode.dp;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class HouseRobberIII {

    public int rob(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Lookup array to store the robbed amount when
        // the root is selected and when it is not selected
        int[] lookup = robHelper(root);
        return Math.max(lookup[0], lookup[1]);
    }

    private int[] robHelper(TreeNode node) {
        // Base case
        if (node == null) {
            return new int[]{0, 0};
        }
        // Get the looted amount for the left subtree
        int[] left = robHelper(node.left);
        // Get the loot amount for the right subtree
        int[] right = robHelper(node.right);
        // Array to store the looted amount
        int[] lookup = new int[2];
        // 1. When root is considered
        lookup[0] = node.val + left[1] + right[1];
        // 2. When root is not considered
        lookup[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return lookup;
    }
}
