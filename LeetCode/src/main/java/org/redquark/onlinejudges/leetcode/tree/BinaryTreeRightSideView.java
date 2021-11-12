package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        // List to store the right side view
        List<Integer> rightView = new ArrayList<>();
        // Special cases
        if (root == null) {
            return rightView;
        }
        // Queue to store the nodes of the tree
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.offer(root);
        // Loop as long we have nodes in the queue
        while (!nodes.isEmpty()) {
            // Get the count of nodes at the current level
            int size = nodes.size();
            // Loop for all the nodes at the current level
            for (int i = 0; i < size; i++) {
                // Get the node at the front
                TreeNode current = nodes.poll();
                // If the current node is the right most one
                if (current != null && i == size - 1) {
                    rightView.add(current.val);
                }
                // Add the left and right children if exist
                if (current != null && current.left != null) {
                    nodes.offer(current.left);
                }
                if (current != null && current.right != null) {
                    nodes.offer(current.right);
                }
            }
        }
        return rightView;
    }
}
