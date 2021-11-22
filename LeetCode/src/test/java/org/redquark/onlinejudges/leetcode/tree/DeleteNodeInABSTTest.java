package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteNodeInABSTTest {

    private final DeleteNodeInABST testObject = new DeleteNodeInABST();

    @Test
    public void testDeleteNode() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int key = 3;
        TreeNode expected = testObject.deleteNode(root, key);
        assertEquals(5, expected.val);
        assertEquals(4, expected.left.val);
        assertEquals(6, expected.right.val);
        assertEquals(2, expected.left.left.val);
        assertEquals(7, expected.right.right.val);

        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        key = 0;
        expected = testObject.deleteNode(root, key);
        assertEquals(5, expected.val);
        assertEquals(2, expected.left.val);
        assertEquals(6, expected.right.val);
        assertEquals(4, expected.left.right.val);
        assertEquals(7, expected.right.right.val);
    }
}