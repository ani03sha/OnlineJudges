package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Get height of the tree
        int height = getHeight(root);
        // Now, we will perform BFS until we reach at the desired level
        // Queue to store the nodes
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root to the queue
        nodes.offer(root);
        // Variable to keep track of levels
        int level = 1;
        // Loop until there are nodes left in the queue
        // and we reach the last level
        while (!nodes.isEmpty() && level != height) {
            // Update the level
            level++;
            // Number of nodes at the current level
            int size = nodes.size();
            // Traverse all the nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = nodes.remove();
                if (current.left != null) {
                    nodes.offer(current.left);
                }
                if (current.right != null) {
                    nodes.offer(current.right);
                }
            }
        }
        // At this point, all the node in the queue belong
        // to the last level, i.e., are leaf nodes
        int sum = 0;
        while (!nodes.isEmpty()) {
            sum += nodes.poll().val;
        }
        return sum;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
