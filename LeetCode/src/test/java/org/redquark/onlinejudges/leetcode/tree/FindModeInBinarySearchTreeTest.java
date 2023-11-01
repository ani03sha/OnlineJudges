package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindModeInBinarySearchTreeTest {

    private final FindModeInBinarySearchTree testObject = new FindModeInBinarySearchTree();

    @Test
    public void testFindMode() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, testObject.findMode(root));

        testObject.maxFrequency = 0;

        root = new TreeNode(0);
        expected = new int[]{0};
        assertArrayEquals(expected, testObject.findMode(root));
    }
}