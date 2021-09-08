package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoBinaryTreesTest {

    private final MergeTwoBinaryTrees testObject = new MergeTwoBinaryTrees();

    @Test
    public void testMergeTrees() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode expected = testObject.mergeTrees(root1, root2);

        assertEquals(3, expected.val);
        assertEquals(4, expected.left.val);
        assertEquals(5, expected.right.val);
        assertEquals(5, expected.left.left.val);
        assertEquals(4, expected.left.right.val);
        assertEquals(7, expected.right.right.val);

        root1 = new TreeNode(1);
        root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        expected = testObject.mergeTrees(root1, root2);
        assertEquals(2, expected.val);
        assertEquals(2, expected.right.val);
    }
}