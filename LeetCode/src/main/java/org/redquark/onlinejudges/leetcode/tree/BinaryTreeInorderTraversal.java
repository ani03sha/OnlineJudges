package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        // List to store the output
        List<Integer> output = new ArrayList<>();
        // Base case
        if (root == null) {
            return output;
        }
        // Stack to store the nodes of the tree
        Stack<TreeNode> nodes = new Stack<>();
        // Reference to the root node
        TreeNode temp = root;
        // Loop until the temp is null or the stack is empty
        while (!nodes.isEmpty() || temp != null) {
            // If temp is not null, then we will push it to the stack
            // and move to the left of it
            if (temp != null) {
                nodes.push(temp);
                temp = temp.left;
            }
            // If temp is null, then pop the node from the stack,
            // add it to the output list and move to the right
            else {
                temp = nodes.pop();
                output.add(temp.val);
                temp = temp.right;
            }
        }
        return output;
    }
}
