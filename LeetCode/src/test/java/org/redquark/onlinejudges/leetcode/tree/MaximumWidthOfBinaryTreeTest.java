package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    private final MaximumWidthOfBinaryTree testObject = new MaximumWidthOfBinaryTree();

    @Test
    public void testWidthOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        assertEquals(4, testObject.widthOfBinaryTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        assertEquals(2, testObject.widthOfBinaryTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        assertEquals(2, testObject.widthOfBinaryTree(root));
    }
}