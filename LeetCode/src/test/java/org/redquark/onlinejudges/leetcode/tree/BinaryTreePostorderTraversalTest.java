package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePostorderTraversalTest {

    private final BinaryTreePostorderTraversal testObject = new BinaryTreePostorderTraversal();

    @Test
    public void testPostorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, testObject.postorderTraversal(root));

        assertEquals(Collections.emptyList(), testObject.postorderTraversal(null));

        root = new TreeNode(1);
        expected = Collections.singletonList(1);
        assertEquals(expected, testObject.postorderTraversal(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        expected = Arrays.asList(2, 1);
        assertEquals(expected, testObject.postorderTraversal(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        expected = Arrays.asList(2, 1);
        assertEquals(expected, testObject.postorderTraversal(root));
    }
}