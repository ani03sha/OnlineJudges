package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Anirudh Sharma
 */
public class VerticalOrderTraversalOfABinaryTree {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // List to store the final output
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Map to store x coordinate as key and list of y coordinate
        // & node's value as value
        Map<Integer, List<int[]>> nodeMap = new TreeMap<>();
        // DFS from root to the bottom
        dfs(root, nodeMap, 0, 0);
        for (List<int[]> value : nodeMap.values()) {
            // Sort the list by x coordinate
            value.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
            List<Integer> list = new ArrayList<>();
            for (int[] v : value) {
                list.add(v[1]);
            }
            output.add(list);
        }
        return output;
    }

    private void dfs(TreeNode node, Map<Integer, List<int[]>> nodeMap, int x, int y) {
        // Special case
        if (node == null) {
            return;
        }
        // List for current level
        List<int[]> current = nodeMap.get(x);
        if (current == null) {
            current = new ArrayList<>();
        }
        // Add the current list to the map
        current.add(new int[]{y, node.val});
        nodeMap.put(x, current);
        // Recurse for left and right subtrees
        dfs(node.left, nodeMap, x - 1, y + 1);
        dfs(node.right, nodeMap, x + 1, y + 1);
    }
}
