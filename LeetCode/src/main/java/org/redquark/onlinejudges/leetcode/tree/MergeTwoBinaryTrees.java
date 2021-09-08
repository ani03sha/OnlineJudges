package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // Special cases
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        // Add the values in two nodes
        root1.val += root2.val;
        // Recur for left and right subtrees
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
