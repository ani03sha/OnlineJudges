package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.tree.BinarySearchTreeIterator.BSTIterator;

public class BinarySearchTreeIteratorTest {

    @Test
    public void test() {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        BSTIterator testObject = new BSTIterator(root);
        assertEquals(3, testObject.next());
        assertEquals(7, testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals(9, testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals(15, testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals(20, testObject.next());
        assertFalse(testObject.hasNext());
    }
}