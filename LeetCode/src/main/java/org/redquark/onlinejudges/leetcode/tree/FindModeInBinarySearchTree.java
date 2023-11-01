package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {

    // Variable to keep track of maximum frequency so far
    int maxFrequency = 0;

    public int[] findMode(TreeNode root) {
        // Special case
        if (root == null) {
            return null;
        }
        // List to store the mode elements
        List<Integer> modes = new ArrayList<>();
        // Map to store the frequencies of each element in the BST
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Perform inorder traversal of the tree
        traverse(root, frequencies);
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }
        return modes
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void traverse(TreeNode root, Map<Integer, Integer> frequencies) {
        // Check for the null node
        if (root == null) {
            return;
        }
        traverse(root.left, frequencies);
        int nodeValue = root.val;
        frequencies.put(nodeValue, frequencies.getOrDefault(nodeValue, 0) + 1);
        maxFrequency = Math.max(maxFrequency, frequencies.get(nodeValue));
        traverse(root.right, frequencies);
    }

    /*****************************************************
     ****** Optimal method to solve the same problem *****
     *****************************************************/

    // Frequency corresponding to the current node
    int localFrequency = 0;
    // Maximum frequency among all nodes
    int globalMaxFrequency = 0;
    // Value in the node we are currently dealing with
    int currentValue;

    public int[] findModeOptimal(TreeNode root) {
        // List to store modes
        List<Integer> modes = new ArrayList<>();
        // Perform inorder traversal
        inorder(root, modes);
        return modes
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void inorder(TreeNode root, List<Integer> modes) {
        if (root == null) {
            return;
        }
        inorder(root.left, modes);
        localFrequency = root.val == currentValue ? localFrequency + 1 : 1;
        if (globalMaxFrequency == localFrequency) {
            modes.add(root.val);
        } else if (localFrequency > globalMaxFrequency) {
            globalMaxFrequency = localFrequency;
            modes.clear();
            modes.add(root.val);
        }
        currentValue = root.val;
        inorder(root.right, modes);
    }
}
