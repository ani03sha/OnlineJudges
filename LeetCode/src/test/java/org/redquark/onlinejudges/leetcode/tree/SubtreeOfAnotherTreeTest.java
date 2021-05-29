package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree testObject = new SubtreeOfAnotherTree();

    @Test
    public void testIsSubtree() {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);

        assertTrue(testObject.isSubtree(t1, t2));

        t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(2);
        t1.left.right.left = new TreeNode(0);

        t2 = new TreeNode(4);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);

        assertFalse(testObject.isSubtree(t1, t2));
    }
}