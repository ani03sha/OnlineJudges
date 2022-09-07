package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTreeTest {

    private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void testInvertTreeRecursive() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode expected = invertBinaryTree.invertTreeRecursive(root);
        assertEquals(4, expected.val);
        assertEquals(7, expected.left.val);
        assertEquals(2, expected.right.val);
        assertEquals(9, expected.left.left.val);
        assertEquals(6, expected.left.right.val);
        assertEquals(3, expected.right.left.val);
        assertEquals(1, expected.right.right.val);

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = invertBinaryTree.invertTreeRecursive(root);
        assertEquals(2, expected.val);
        assertEquals(3, expected.left.val);
        assertEquals(1, expected.right.val);

        assertNull(invertBinaryTree.invertTreeRecursive(null));
    }

    @Test
    public void testInvertTreeIterative() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode expected = invertBinaryTree.invertTreeIterative(root);
        assertEquals(4, expected.val);
        assertEquals(7, expected.left.val);
        assertEquals(2, expected.right.val);
        assertEquals(9, expected.left.left.val);
        assertEquals(6, expected.left.right.val);
        assertEquals(3, expected.right.left.val);
        assertEquals(1, expected.right.right.val);

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = invertBinaryTree.invertTreeIterative(root);
        assertEquals(2, expected.val);
        assertEquals(3, expected.left.val);
        assertEquals(1, expected.right.val);

        assertNull(invertBinaryTree.invertTreeRecursive(null));
    }
}