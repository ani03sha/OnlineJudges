package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Objects;
import java.util.Stack;

public class SameTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        // Special cases
        if (p == null || q == null) {
            return Objects.equals(p, q);
        }
        // If the values at the current node are not same, we
        // will return false
        if (p.val != q.val) {
            return false;
        }
        // Check the validity for the left and right subtrees
        return isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        // Special cases
        if (p == null || q == null) {
            return Objects.equals(p, q);
        }
        // Stacks to store the nodes
        Stack<TreeNode> pNodes = new Stack<>();
        Stack<TreeNode> qNodes = new Stack<>();
        // Add root nodes to the stacks
        pNodes.push(p);
        qNodes.push(q);
        // Loop until both the stacks have nodes
        while (!pNodes.isEmpty() && !qNodes.isEmpty()) {
            // Get the front of the queues
            TreeNode pCurrent = pNodes.pop();
            TreeNode qCurrent = qNodes.pop();
            // Check if the current values are same
            if (pCurrent.val != qCurrent.val) {
                return false;
            }
            // Add the left and right nodes to the stacks, if they
            // are not null
            if (pCurrent.left != null && qCurrent.left != null) {
                pNodes.push(pCurrent.left);
                qNodes.push(qCurrent.left);
            } else if (pCurrent.left != null || qCurrent.left != null) {
                return false;
            }
            if (pCurrent.right != null && qCurrent.right != null) {
                pNodes.push(pCurrent.right);
                qNodes.push(qCurrent.right);
            } else if (pCurrent.right != null || qCurrent.right != null) {
                return false;
            }
        }
        return true;
    }
}
