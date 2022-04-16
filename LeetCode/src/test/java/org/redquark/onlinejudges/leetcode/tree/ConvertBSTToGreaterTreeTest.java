package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBSTToGreaterTreeTest {

    private final ConvertBSTToGreaterTree testObject = new ConvertBSTToGreaterTree();

    @Test
    public void testConvertBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);
        TreeNode expected = testObject.convertBST(root);
        assertEquals(30, expected.val);
        assertEquals(36, expected.left.val);
        assertEquals(21, expected.right.val);
        assertEquals(36, expected.left.left.val);
        assertEquals(35, expected.left.right.val);
        assertEquals(26, expected.right.left.val);
        assertEquals(15, expected.right.right.val);
        assertEquals(33, expected.left.right.right.val);
        assertEquals(8, expected.right.right.right.val);
    }
}