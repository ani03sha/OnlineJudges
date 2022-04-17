package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        // Get inorder traversal of the tree
        List<Integer> inorder = getInorderTraversal(root);
        // Create root of the new tree
        TreeNode newRoot = new TreeNode(inorder.get(0));
        // Reference of the new root
        TreeNode current = newRoot;
        // Add all the nodes to the right of their respective
        // parent nodes
        for (int i = 1; i < inorder.size(); i++) {
            current.right = new TreeNode(inorder.get(i));
            current = current.right;
        }
        return newRoot;
    }

    private List<Integer> getInorderTraversal(TreeNode root) {
        // List to store the inorder traversal
        List<Integer> inorder = new ArrayList<>();
        // Special case
        if (root == null) {
            return inorder;
        }
        // Deque (stack) to store the nodes for inorder traversal
        Deque<TreeNode> nodes = new ArrayDeque<>();
        // Reference of the root node
        TreeNode current = root;
        // Loop until deque is not empty or a node is null
        while (!nodes.isEmpty() || current != null) {
            // If the current node is not null, we will
            // add it to the deque and will move left
            if (current != null) {
                nodes.push(current);
                current = current.left;
            }
            // If the node is null, we will pop it from
            // the deque and move to the right
            else {
                current = nodes.pop();
                inorder.add(current.val);
                current = current.right;
            }
        }
        return inorder;
    }
}
