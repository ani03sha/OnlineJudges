package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePathsTest {

    private final BinaryTreePaths testObject = new BinaryTreePaths();

    @Test
    public void testBinaryTreePathsWithString() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertEquals(expected, testObject.binaryTreePathsWithString(root));

        root = new TreeNode(1);
        expected = Collections.singletonList("1");
        assertEquals(expected, testObject.binaryTreePathsWithString(root));
    }

    @Test
    public void testBinaryTreePathsWithStringBuilder() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertEquals(expected, testObject.binaryTreePathsWithStringBuilder(root));

        root = new TreeNode(1);
        expected = Collections.singletonList("1");
        assertEquals(expected, testObject.binaryTreePathsWithStringBuilder(root));
    }
}