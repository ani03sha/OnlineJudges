package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        // The idea is to store the indices of the left most node
        // and right most node at a level and find the difference
        // between them. That way, we will check of all the levels.
        return dfs(root, 0, 1, new ArrayList<>(), new ArrayList<>());
    }

    private int dfs(TreeNode root, int level, int index, List<Integer> leftIndices, List<Integer> rightIndices) {
        // Special cases
        if (root == null) {
            return 0;
        }
        if (level == leftIndices.size()) {
            leftIndices.add(index);
            rightIndices.add(index);
        } else {
            rightIndices.set(level, index);
        }
        // Calculate the width of the current level
        int currentWidth = rightIndices.get(level) - leftIndices.get(level) + 1;
        // Recursively calculate for left and right subtrees
        // Since index of left child of a node with index `i` will be `2 * i`
        // and index of right child of a node with index `i` will be `2 * i + 1`
        int left = dfs(root.left, level + 1, 2 * index, leftIndices, rightIndices);
        int right = dfs(root.right, level + 1, 2 * index + 1, leftIndices, rightIndices);
        return Math.max(currentWidth, Math.max(left, right));
    }
}
