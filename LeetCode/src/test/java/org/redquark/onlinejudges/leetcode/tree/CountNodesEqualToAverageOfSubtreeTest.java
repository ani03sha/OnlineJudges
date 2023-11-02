package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNodesEqualToAverageOfSubtreeTest {

    private final CountNodesEqualToAverageOfSubtree testObject = new CountNodesEqualToAverageOfSubtree();

    @Test
    public void testAverageOfSubtree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);
        assertEquals(5, testObject.averageOfSubtree(root));

        testObject.count = 0;

        root = new TreeNode(1);
        assertEquals(1, testObject.averageOfSubtree(root));
    }
}