package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfLeftLeavesTest {

    private final SumOfLeftLeaves testObject = new SumOfLeftLeaves();

    @Test
    public void testSumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(24, testObject.sumOfLeftLeaves(root));

        root = new TreeNode(1);
        assertEquals(0, testObject.sumOfLeftLeaves(root));
    }
}