package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(log(n))
     */
    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        // Special case
        if (root == null) {
            return null;
        }
        // If value of both p and q nodes are smaller than the root value,
        // we will go in the left subtree
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestorRecursive(root.left, p, q);
        }
        // If value of both p and q nodes are greater than the root value,
        // we will go in the right subtree
        else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestorRecursive(root.right, p, q);
        }
        // This condition means that both nodes are present in different
        // subtrees - in that case, root (current) would be the LCA.
        else {
            return root;
        }
    }

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        // Special case
        if (root == null) {
            return null;
        }
        // We will keep on searching in the same subtree unless the values of p
        // and q are less/more than the current root.
        while ((p.val < root.val && q.val < root.val) || (p.val > root.val && q.val > root.val)) {
            root = p.val < root.val ? root.left : root.right;
        }
        // If they are in different subtree then only the current root can be
        // the LCA.
        return root;
    }
}
