package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNodeWithNext;

/**
 * @author Anirudh Sharma
 */
public class PopulatingNextRightPointersInEachNode {

    public TreeNodeWithNext connect(TreeNodeWithNext root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Pointer for denoting the current node
        TreeNodeWithNext current = root;
        // Since this is a complete binary tree, as long as we have left
        // child not null, we will be moving towards the next level
        while (current.left != null) {
            // Left child of the current node will be the first
            // node in the next level
            TreeNodeWithNext nextLevel = current.left;
            // Now populate the next pointers of the next level nodes
            while (current != null) {
                current.left.next = current.right;
                // If next of current is null, it means it's right child
                // will be the last node of the level, therefore, its next
                // will be null. If current node is not null, then we will
                // fix the next pointers
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                // Move to the next node on this level
                current = current.next;
            }
            // Move to the next level
            current = nextLevel;
        }
        return root;
    }
}
