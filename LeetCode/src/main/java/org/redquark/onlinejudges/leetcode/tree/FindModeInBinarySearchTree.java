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
        System.out.println(frequencies);
        System.out.println(maxFrequency);
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
}
