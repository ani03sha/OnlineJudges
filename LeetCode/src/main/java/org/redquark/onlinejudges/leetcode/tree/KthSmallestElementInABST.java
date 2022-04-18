package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class KthSmallestElementInABST {

    private int kthSmallestElement = 0;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        this.count = k;
        findKthSmallestElement(root);
        return this.kthSmallestElement;
    }

    private void findKthSmallestElement(TreeNode root) {
        // Special case
        if (root == null) {
            throw new IllegalArgumentException("Root of the tree cannot be null");
        }
        // Move towards the left of the tree
        if (root.left != null) {
            findKthSmallestElement(root.left);
        }
        // Decrement the value of k
        count--;
        if (count == 0) {
            this.kthSmallestElement = root.val;
            return;
        }
        // If we haven't yet reached the k-th smallest node in
        // the entire left subtree, we will move to the right
        if (root.right != null) {
            findKthSmallestElement(root.right);
        }
    }
}
