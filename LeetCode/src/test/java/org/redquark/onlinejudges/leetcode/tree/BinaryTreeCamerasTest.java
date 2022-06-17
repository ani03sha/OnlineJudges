package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeCamerasTest {

    private BinaryTreeCameras testObject = new BinaryTreeCameras();

    @Test
    public void testMinCameraCover() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        assertEquals(1, testObject.minCameraCover(root));

        testObject = new BinaryTreeCameras();
        root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.right = new TreeNode(0);
        assertEquals(2, testObject.minCameraCover(root));
    }
}