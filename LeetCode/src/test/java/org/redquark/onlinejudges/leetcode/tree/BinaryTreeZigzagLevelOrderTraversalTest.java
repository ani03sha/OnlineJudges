package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    private final BinaryTreeZigzagLevelOrderTraversal testObject = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void testZigzagLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected, testObject.zigzagLevelOrder(root));

        root = new TreeNode(1);
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, testObject.zigzagLevelOrder(root));

        assertEquals(Collections.emptyList(), testObject.zigzagLevelOrder(null));
    }
}