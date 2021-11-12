package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView testObject = new BinaryTreeRightSideView();

    @Test
    public void testRightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, testObject.rightSideView(root));

        root = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = Arrays.asList(1, 3);
        assertEquals(expected, testObject.rightSideView(root));

        expected = Collections.emptyList();
        assertEquals(expected, testObject.rightSideView(null));
    }
}