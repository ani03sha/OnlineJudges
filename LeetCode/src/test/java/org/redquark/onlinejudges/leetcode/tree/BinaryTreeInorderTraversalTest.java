package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal testObject = new BinaryTreeInorderTraversal();

    @Test
    public void testInorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, testObject.inorderTraversal(root));

        assertEquals(Collections.emptyList(), testObject.inorderTraversal(null));

        root = new TreeNode(1);
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.inorderTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        expected = Arrays.asList(2, 1);
        assertEquals(expected, testObject.inorderTraversal(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        expected = Arrays.asList(1, 2);
        assertEquals(expected, testObject.inorderTraversal(root));
    }
}