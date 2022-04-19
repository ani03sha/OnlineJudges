package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecoverBinarySearchTreeTest {

    private final RecoverBinarySearchTree testObject = new RecoverBinarySearchTree();

    @Test
    public void testRecoverTreeSolutionOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        TreeNode expected = testObject.recoverTreeSolutionOne(root);
        assertEquals(3, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(2, expected.left.right.val);

        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        expected = testObject.recoverTreeSolutionOne(root);
        assertEquals(2, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(4, expected.right.val);
        assertEquals(3, expected.right.left.val);
    }

    @Test
    public void testRecoverTreeSolutionTwo() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        TreeNode expected = testObject.recoverTreeSolutionTwo(root);
        assertEquals(3, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(2, expected.left.right.val);

        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        expected = testObject.recoverTreeSolutionTwo(root);
        assertEquals(2, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(4, expected.right.val);
        assertEquals(3, expected.right.left.val);
    }
}