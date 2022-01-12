package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertIntoABinarySearchTreeTest {

    private final InsertIntoABinarySearchTree testObject = new InsertIntoABinarySearchTree();

    @Test
    public void testInsertIntoBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 5;
        TreeNode expected = testObject.insertIntoBST(root, val);
        assertEquals(4, expected.val);
        assertEquals(2, expected.left.val);
        assertEquals(7, expected.right.val);
        assertEquals(1, expected.left.left.val);
        assertEquals(3, expected.left.right.val);
        assertEquals(5, expected.right.left.val);

        root = new TreeNode(40);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(70);
        val = 25;
        expected = testObject.insertIntoBST(root, val);
        assertEquals(40, expected.val);
        assertEquals(20, expected.left.val);
        assertEquals(30, expected.left.right.val);
        assertEquals(25, expected.left.right.left.val);
    }
}