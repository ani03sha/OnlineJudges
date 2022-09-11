package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    private final LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree =
            new LowestCommonAncestorOfABinarySearchTree();

    @Test
    public void testLowestCommonAncestorRecursive() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorRecursive(root, p, q);
        assertEquals(6, expected.val);

        p = root.left;
        q = root.left.right;
        expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorRecursive(root, p, q);
        assertEquals(2, expected.val);

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        p = root;
        q = root.left;
        expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorRecursive(root, p, q);
        assertEquals(2, expected.val);
    }

    @Test
    public void testLowestCommonAncestorIterative() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorIterative(root, p, q);
        assertEquals(6, expected.val);

        p = root.left;
        q = root.left.right;
        expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorIterative(root, p, q);
        assertEquals(2, expected.val);

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        p = root;
        q = root.left;
        expected = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestorIterative(root, p, q);
        assertEquals(2, expected.val);
    }
}