package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {

    private final FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree testObject =
            new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();

    @Test
    public void testGetTargetCopy() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);
        TreeNode target = original.right;
        TreeNode expected = testObject.getTargetCopy(original, original, target);
        assertEquals(expected, target);
    }
}