package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class CountNodesEqualToAverageOfSubtree {

    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }

    private int[] dfs(TreeNode node) {
        int currentSum = node.val;
        // Count of nodes in current subtree
        int subtreeCount = 1;
        if (node.left != null) {
            int[] left = dfs(node.left);
            currentSum += left[0];
            subtreeCount += left[1];
        }
        if (node.right != null) {
            int[] right = dfs(node.right);
            currentSum += right[0];
            subtreeCount += right[1];
        }
        // Calculate the average
        int average = currentSum / subtreeCount;
        // Check for the desired condition
        if (average == node.val) {
            count++;
        }
        return new int[]{currentSum, subtreeCount};
    }
}
