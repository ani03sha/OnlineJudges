package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerticalOrderTraversalOfABinaryTreeTest {

    private final VerticalOrderTraversalOfABinaryTree testObject = new VerticalOrderTraversalOfABinaryTree();

    @Test
    public void testVerticalTraversal() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(9));
        expected.add(Arrays.asList(3, 15));
        expected.add(Collections.singletonList(20));
        expected.add(Collections.singletonList(7));
        assertEquals(expected, testObject.verticalTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(4));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(1, 5, 6));
        expected.add(Collections.singletonList(3));
        expected.add(Collections.singletonList(7));
        assertEquals(expected, testObject.verticalTraversal(root));
    }
}