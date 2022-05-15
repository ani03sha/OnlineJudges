package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RootEqualsSumOfChildrenTest {

    private final RootEqualsSumOfChildren testObject = new RootEqualsSumOfChildren();

    @Test
    public void testCheckTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        assertTrue(testObject.checkTree(root));

        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        assertFalse(testObject.checkTree(root));
    }
}