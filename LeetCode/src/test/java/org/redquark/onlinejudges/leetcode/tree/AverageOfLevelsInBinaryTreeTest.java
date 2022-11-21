package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfLevelsInBinaryTreeTest {

    private final AverageOfLevelsInBinaryTree testObject = new AverageOfLevelsInBinaryTree();

    @Test
    public void testAverageOfLevels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> expected = List.of(3.00000, 14.50000, 11.00000);
        assertEquals(expected, testObject.averageOfLevels(root));

        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        expected = List.of(3.00000, 14.50000, 11.00000);
        assertEquals(expected, testObject.averageOfLevels(root));
    }
}