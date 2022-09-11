package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    public void testIsBalancedBruteForce() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalancedBruteForce(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        assertFalse(balancedBinaryTree.isBalancedBruteForce(root));

        assertTrue(balancedBinaryTree.isBalancedBruteForce(null));
    }

    @Test
    public void testIsBalancedOptimal() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalancedOptimal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        assertFalse(balancedBinaryTree.isBalancedOptimal(root));

        assertTrue(balancedBinaryTree.isBalancedOptimal(null));
    }
}