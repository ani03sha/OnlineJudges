package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CousinsInBinaryTreeTest {

    private final CousinsInBinaryTree testObject = new CousinsInBinaryTree();

    @Test
    public void testIsCousins() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int x = 4;
        int y = 3;
        assertFalse(testObject.isCousins(root, x, y));

        x = 3;
        y = 2;
        assertFalse(testObject.isCousins(root, x, y));

        root.right.right = new TreeNode(5);
        x = 4;
        y = 5;
        assertTrue(testObject.isCousins(root, x, y));
    }
}