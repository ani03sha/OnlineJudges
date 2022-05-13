package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNodeWithNext;

/**
 * @author Anirudh Sharma
 */
public class PopulatingNextRightPointersInEachNodeII {

    public TreeNodeWithNext connect(TreeNodeWithNext root) {
        // Special case
        if (root == null) {
            return null;
        }
        // Reference of the root node
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findNextNode(root);
            }
        }
        if (root.right != null) {
            root.right.next = findNextNode(root);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }

    private TreeNodeWithNext findNextNode(TreeNodeWithNext root) {
        while (root.next != null) {
            root = root.next;
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
        }
        return null;
    }
}
