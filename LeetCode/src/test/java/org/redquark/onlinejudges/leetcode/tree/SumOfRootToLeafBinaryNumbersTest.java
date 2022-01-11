package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfRootToLeafBinaryNumbersTest {

    private final SumOfRootToLeafBinaryNumbers testObject = new SumOfRootToLeafBinaryNumbers();

    @Test
    public void testSumRootToLeaf() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        assertEquals(22, testObject.sumRootToLeaf(root));

        root = new TreeNode(0);
        assertEquals(0, testObject.sumRootToLeaf(root));
    }
}