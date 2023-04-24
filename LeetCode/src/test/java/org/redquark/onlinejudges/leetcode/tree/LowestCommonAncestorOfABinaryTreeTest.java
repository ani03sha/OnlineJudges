package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfABinaryTreeTest {

    private final LowestCommonAncestorOfABinaryTree testObject = new LowestCommonAncestorOfABinaryTree();

    @Test
    public void testLowestCommonAncestor() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(3, testObject.lowestCommonAncestor(root, p, q).val);

        p = root.left;
        q = root.left.right.right;
        assertEquals(5, testObject.lowestCommonAncestor(root, p, q).val);

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        p = root;
        q = root.left;
        assertEquals(1, testObject.lowestCommonAncestor(root, p, q).val);
    }
}