package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestZigZagPathInABinaryTreeTest {

    private final LongestZigZagPathInABinaryTree testObject = new LongestZigZagPathInABinaryTree();

    @Test
    public void testLongestZigZag() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        root.right.right.left.right = new TreeNode(1);
        root.right.right.left.right.right = new TreeNode(1);
        assertEquals(3, testObject.longestZigZag(root));

        root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(1);
        root.left.right.left.right = new TreeNode(1);
        assertEquals(4, testObject.longestZigZag(root));

        root = new TreeNode(1);
        assertEquals(0, testObject.longestZigZag(root));

    }
}