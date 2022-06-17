package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreeCameras {

    private int count = 0;

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == -1) {
            count++;
        }
        return count;
    }

    private int dfs(TreeNode root) {
        // Flag for left and right children
        int left = 0;
        int right = 0;
        // Check for leaft nodes
        if (root.left == null && root.right == null) {
            return -1;
        }
        // If left child is not null
        if (root.left != null) {
            left = dfs(root.left);
        }
        // If right child is not null
        if (root.right != null) {
            right = dfs(root.right);
        }
        // If we have found there is no camera,
        // then we will install one.
        if (left == -1 || right == -1) {
            this.count++;
            return 1;
        }
        // If we have not traversed the nodes yet
        if (left == 0 && right == 0) {
            return -1;
        }
        // If the node has camera, then we skip
        if (left == 1 || right == 1) {
            return 0;
        }
        return this.count;
    }
}
