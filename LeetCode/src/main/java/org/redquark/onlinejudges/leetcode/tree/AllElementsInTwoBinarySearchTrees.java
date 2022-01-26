package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        // List to store the final output
        List<Integer> output = new ArrayList<>();
        // Lists to store all nodes of first and second tree
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // Inorder traversal of both the trees
        inorder(root1, list1);
        inorder(root2, list2);
        // Merge the sorted lists
        return mergeSortedLists(list1, list2, output);
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2, List<Integer> output) {
        if (list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }
        // Pointers to traverse through the lists
        int i = 0;
        int j = 0;
        // Loop through the lists and merge
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                output.add(list1.get(i));
                i++;
            } else {
                output.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            output.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            output.add(list2.get(j));
            j++;
        }
        return output;
    }
}
