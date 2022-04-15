package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrimABinarySearchTreeTest {

    private final TrimABinarySearchTree testObject = new TrimABinarySearchTree();

    @Test
    public void testTrimBST() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        int low = 1;
        int high = 2;
        TreeNode expected = testObject.trimBST(root, low, high);
        assertEquals(1, expected.val);
        assertEquals(2, expected.right.val);

        root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        high = 3;
        expected = testObject.trimBST(root, low, high);
        assertEquals(3, expected.val);
        assertEquals(2, expected.left.val);
        assertEquals(1, expected.left.left.val);
    }
}