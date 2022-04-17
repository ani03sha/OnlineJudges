package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncreasingOrderSearchTreeTest {

    private final IncreasingOrderSearchTree testObject = new IncreasingOrderSearchTree();

    @Test
    public void testIncreasingBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        TreeNode expected = testObject.increasingBST(root);
        assertEquals(1, expected.val);
        assertEquals(2, expected.right.val);
        assertEquals(3, expected.right.right.val);
        assertEquals(4, expected.right.right.right.val);
        assertEquals(5, expected.right.right.right.right.val);
        assertEquals(6, expected.right.right.right.right.right.val);
        assertEquals(7, expected.right.right.right.right.right.right.val);
        assertEquals(8, expected.right.right.right.right.right.right.right.val);
        assertEquals(9, expected.right.right.right.right.right.right.right.right.val);

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        expected = testObject.increasingBST(root);
        assertEquals(1, expected.val);
        assertEquals(5, expected.right.val);
        assertEquals(7, expected.right.right.val);

    }
}