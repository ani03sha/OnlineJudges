package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // List to store the final output
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Queue to store the nodes of the tree
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.add(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the size of the queue to traverse the current level
            int size = nodes.size();
            // List to store nodes of current level
            List<Integer> currentLevel = new ArrayList<>();
            // Loop through all the nodes at the current level
            for (int i = 0; i < size; i++) {
                // Get the current node
                TreeNode currentNode = nodes.poll();
                // Add this node to the list
                if (currentNode != null) {
                    currentLevel.add(currentNode.val);
                    // For left and right subtrees
                    if (currentNode.left != null) {
                        nodes.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        nodes.add(currentNode.right);
                    }
                }
            }
            // Add the list of nodes on current level to the final output
            output.add(currentLevel);
        }
        return output;
    }
}
