package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.tree.ValidateBinarySearchTree.TreeNode;

public class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree testObject = new ValidateBinarySearchTree();

    @Test
    public void testIsValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertTrue(testObject.isValidBST(root));

        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        assertFalse(testObject.isValidBST(root));
    }
}