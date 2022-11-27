package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllNodesDistanceKInBinaryTreeTest {

    private final AllNodesDistanceKInBinaryTree testObject = new AllNodesDistanceKInBinaryTree();

    @Test
    public void testDistanceK() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        List<Integer> expected = List.of(1, 7, 4);
        assertEquals(expected, testObject.distanceK(root, root.left, 2));

        root = new TreeNode(1);

        expected = List.of();
        assertEquals(expected, testObject.distanceK(root, root, 3));
    }
}