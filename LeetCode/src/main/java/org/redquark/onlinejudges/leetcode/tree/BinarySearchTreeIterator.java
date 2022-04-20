package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Anirudh Sharma
 */
public class BinarySearchTreeIterator {

    static class BSTIterator {
        // Stack to store the nodes of tree
        private final Deque<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            this.stack = new ArrayDeque<>();
            // Reference to the root of the node
            TreeNode current = root;
            // Add all the left nodes of the tree
            while (current != null) {
                this.stack.push(current);
                if (current.left != null) {
                    current = current.left;
                } else {
                    break;
                }
            }
        }

        public int next() {
            // Get the node on the top of the stack
            TreeNode top = this.stack.pop();
            // Reference to the top
            TreeNode current = top;
            // Traverse right subtree
            if (current.right != null) {
                // Move right
                current = current.right;
                while (current != null) {
                    this.stack.push(current);
                    // Now traverse the left child of this
                    // node to maintain the sorted order
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        break;
                    }
                }
            }
            return top.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
