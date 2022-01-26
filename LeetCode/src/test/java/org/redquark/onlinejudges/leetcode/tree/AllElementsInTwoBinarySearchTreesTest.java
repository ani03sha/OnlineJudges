package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllElementsInTwoBinarySearchTreesTest {

    private final AllElementsInTwoBinarySearchTrees testObject = new AllElementsInTwoBinarySearchTrees();

    @Test
    public void testGetAllElements() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 4);
        assertEquals(expected, testObject.getAllElements(root1, root2));
    }
}