package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePreorderTraversalTest {

    private final BinaryTreePreorderTraversal testObject = new BinaryTreePreorderTraversal();

    @Test
    public void testPreorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, testObject.preorderTraversal(root));

        assertEquals(Collections.emptyList(), testObject.preorderTraversal(null));

        root = new TreeNode(1);
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.preorderTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.preorderTraversal(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.preorderTraversal(root));
    }
}