package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInABSTTest {

    private final KthSmallestElementInABST testObject = new KthSmallestElementInABST();

    @Test
    public void testKthSmallest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        assertEquals(1, testObject.kthSmallest(root, k));

        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        k = 3;
        assertEquals(3, testObject.kthSmallest(root, k));
    }
}