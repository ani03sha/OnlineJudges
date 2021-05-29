package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode t1, TreeNode t2) {
        // Since a null tree is subtree of every tree
        if (t2 == null) {
            return true;
        }
        // If the bigger tree is null, it means it
        // cannot have any child tree
        if (t1 == null) {
            return false;
        }
        if (t1.val == t2.val && matchTree(t1, t2)) {
            return true;
        }
        // Recurse for left and right subtrees
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }

    private boolean matchTree(TreeNode t1, TreeNode t2) {
        // If we have reached to the leaves
        if (t1 == null && t2 == null) {
            return true;
        }
        // If one tree is empty, so the trees cannot be matched
        if (t1 == null || t2 == null) {
            return false;
        }
        // If the nodes don't match, return false
        else if (t1.val != t2.val) {
            return false;
        }
        // Recurse for the subtrees
        return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
    }
}
