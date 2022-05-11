package org.redquark.onlinejudges.leetcode.backtracking;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class BinaryTreePaths {

    public List<String> binaryTreePathsWithString(TreeNode root) {
        // List to store root to leaf paths
        List<String> paths = new ArrayList<>();
        // Special case
        if (root == null) {
            return paths;
        }
        // Perform backtracking algorithm
        backtrackWithString(root, "", paths);
        return paths;
    }

    private void backtrackWithString(TreeNode node, String path, List<String> paths) {
        // Base case
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        }
        if (node.left != null) {
            backtrackWithString(node.left, path + node.val + "->", paths);
        }
        if (node.right != null) {
            backtrackWithString(node.right, path + node.val + "->", paths);
        }
    }

    public List<String> binaryTreePathsWithStringBuilder(TreeNode root) {
        // List to store root to leaf paths
        List<String> paths = new ArrayList<>();
        // Special case
        if (root == null) {
            return paths;
        }
        // StringBuilder to store the current path
        StringBuilder path = new StringBuilder();
        // Perform backtracking algorithm
        backtrackWithStringBuilder(root, path, paths);
        return paths;
    }

    private void backtrackWithStringBuilder(TreeNode node, StringBuilder path, List<String> paths) {
        if (node == null) {
            return;
        }
        // Length of path before performing backtracking
        int length = path.length();
        // Add the current node to the path
        path.append(node.val);
        // If this is the leaf node
        if (node.left == null && node.right == null) {
            paths.add(path.toString());
        } else {
            // Recurse for left and right subtrees
            path.append("->");
            backtrackWithStringBuilder(node.left, path, paths);
            backtrackWithStringBuilder(node.right, path, paths);
        }
        // Backtrack
        path.setLength(length);
    }
}
