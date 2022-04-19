package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Anirudh Sharma
 */
public class RecoverBinarySearchTree {

    public TreeNode recoverTreeSolutionOne(TreeNode root) {
        // Two incorrect nodes which were swapped
        TreeNode firstIncorrectNode = null;
        TreeNode secondIncorrectNode = null;
        // Pointers to represent current and previous nodes
        TreeNode currentNode = root;
        TreeNode previousNode = null;
        // Deque (stack) for inorder traversal
        Deque<TreeNode> nodes = new ArrayDeque<>();
        // Loop until the condition holds true
        while (!nodes.isEmpty() || currentNode != null) {
            // If the current node is not null, move towards the
            // left subtree
            if (currentNode != null) {
                nodes.push(currentNode);
                currentNode = currentNode.left;
            }
            // Done with the left subtree
            else {
                currentNode = nodes.remove();
                // Compare with th previous node, if there's any
                if (previousNode != null && previousNode.val >= currentNode.val) {
                    if (firstIncorrectNode == null) {
                        firstIncorrectNode = previousNode;
                    }
                    secondIncorrectNode = currentNode;
                }
                // Go to current node's right subtree
                previousNode = currentNode;
                currentNode = currentNode.right;
            }
        }
        // Fix swapped nodes
        int temp = firstIncorrectNode.val;
        firstIncorrectNode.val = secondIncorrectNode.val;
        secondIncorrectNode.val = temp;
        return root;
    }

    public TreeNode recoverTreeSolutionTwo(TreeNode root) {
        // Two incorrect nodes which were swapped
        TreeNode firstIncorrectNode = null;
        TreeNode secondIncorrectNode = null;
        // Pointers to the current and previous nodes
        TreeNode currentNode = root;
        TreeNode previousNode = null;
        // Node that represents the rightmost node in
        // the left subtree or predecessor of root
        TreeNode predecessorNode;
        // Loop until the current node is not null
        while (currentNode != null) {
            // Compare the values in previous and current nodes
            if (previousNode != null && previousNode.val >= currentNode.val) {
                if (firstIncorrectNode == null) {
                    firstIncorrectNode = previousNode;
                }
                secondIncorrectNode = currentNode;
            }
            // Find the rightmost node in the left subtree
            if (currentNode.left != null) {
                predecessorNode = currentNode.left;
                while (predecessorNode.right != null && predecessorNode.right != currentNode) {
                    predecessorNode = predecessorNode.right;
                }
                // If the rightmost node is same as the current node, cut
                // the connection because we have visited this node before
                if (predecessorNode.right == currentNode) {
                    predecessorNode.right = null;
                    previousNode = currentNode;
                    currentNode = currentNode.right;
                }
                // If we have not visited the node before, we will create a back edge
                // from rightmost node to the current node
                else {
                    predecessorNode.right = currentNode;
                    currentNode = currentNode.left;
                }
            }
            // If there's no left subtree, we will move to the right subtree
            else {
                previousNode = currentNode;
                currentNode = currentNode.right;
            }
        }
        // Swap the values
        int temp = firstIncorrectNode.val;
        firstIncorrectNode.val = secondIncorrectNode.val;
        secondIncorrectNode.val = temp;
        return root;
    }
}
