package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.design.SerializeAndDeserializeBinaryTree.Codec;

public class SerializeAndDeserializeBinaryTreeTest {

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Codec serialized = new Codec();
        Codec deserialized = new Codec();
        String serializedTree = serialized.serialize(root);
        TreeNode deserializedTree = deserialized.deserialize(serializedTree);
        assertEquals(root.val, deserializedTree.val);
        assertEquals(root.left.val, deserializedTree.left.val);
        assertEquals(root.right.val, deserializedTree.right.val);
        assertEquals(root.right.left.val, deserializedTree.right.left.val);
        assertEquals(root.right.right.val, deserializedTree.right.right.val);
    }
}