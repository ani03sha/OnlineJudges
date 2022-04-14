package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchInABinarySearchTreeTest {

    private final SearchInABinarySearchTree testObject = new SearchInABinarySearchTree();

    @Test
    public void testSearchBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode expected = testObject.searchBST(root, val);
        assertEquals(2, expected.val);
        assertEquals(1, expected.left.val);
        assertEquals(3, expected.right.val);

        val = 5;
        assertNull(testObject.searchBST(root, val));
    }
}