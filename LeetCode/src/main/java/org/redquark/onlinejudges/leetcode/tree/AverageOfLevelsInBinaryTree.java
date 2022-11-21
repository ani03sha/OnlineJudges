package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public List<Double> averageOfLevels(TreeNode root) {
        // List to store the average of levels
        List<Double> levelAverages = new ArrayList<>();
        // Special case
        if (root == null) {
            return levelAverages;
        }
        // Queue to store the BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add the root node to the queue
        nodes.offer(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the count of nodes at the current level
            int count = nodes.size();
            // Sum of all node values at current level
            double currentLevelSum = 0;
            // Loop through the current level
            for (int i = 0; i < count; i++) {
                TreeNode node = nodes.remove();
                currentLevelSum += node.val;
                // Add left and right children of the current
                // node to the queue, if they are not null
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            // Add the average of current level in the list
            levelAverages.add(currentLevelSum / count);
        }
        return levelAverages;
    }
}
