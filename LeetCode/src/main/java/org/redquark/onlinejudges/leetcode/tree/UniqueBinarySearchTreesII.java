package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        return constructTrees(1, n);
    }

    private List<TreeNode> constructTrees(int left, int right) {
        // List to store the roots of tree
        List<TreeNode> trees = new ArrayList<>();
        // Base case
        if (left > right) {
            trees.add(null);
            return trees;
        }
        // Loop for all values from left to right
        for (int i = left; i <= right; i++) {
            // Constructing left subtree
            List<TreeNode> leftSubtree = constructTrees(left, i - 1);
            // Constructing right subtree
            List<TreeNode> rightSubtree = constructTrees(i + 1, right);
            // Loop through all left and right subtrees and join them with the
            // i-th node
            for (TreeNode leftNode : leftSubtree) {
                for (TreeNode rightNode : rightSubtree) {
                    // Create a new node with i-th value
                    TreeNode root = new TreeNode(i);
                    // Connect them to left and right subtrees
                    root.left = leftNode;
                    root.right = rightNode;
                    // Add this root to the list
                    trees.add(root);
                }
            }
        }
        return trees;
    }
}
