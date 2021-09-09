package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        // List to store the output
        List<Integer> preorder = new ArrayList<>();
        // Special case
        if (root == null) {
            return preorder;
        }
        // Stack to store the nodes of the tree
        Stack<TreeNode> nodes = new Stack<>();
        // Push the root node to the stack
        nodes.push(root);
        // Loop until the stack is empty
        while (!nodes.isEmpty()) {
            // Get the current node from stack
            TreeNode current = nodes.pop();
            // Add this node to the final output
            preorder.add(current.val);
            // Check for left and right subtrees and add first
            // right and then left due to stack's LIFO property
            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
        return preorder;
    }
}
