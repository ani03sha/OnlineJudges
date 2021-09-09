package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        // List to store the result
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // Stack to store the nodes of the tree
        Stack<TreeNode> nodes = new Stack<>();
        // Push the root to the stack
        nodes.push(root);
        // Another stack to store postorder traversal
        Stack<Integer> postOrder = new Stack<>();
        // Loop until the stack is empty
        while (!nodes.isEmpty()) {
            // Get the current node from the stack
            TreeNode current = nodes.pop();
            postOrder.push(current.val);
            // Push left child if not null
            if (current.left != null) {
                nodes.add(current.left);
            }
            // Push right child if not null
            if (current.right != null) {
                nodes.add(current.right);
            }
        }
        while (!postOrder.isEmpty()) {
            result.add(postOrder.pop());
        }
        return result;
    }
}
