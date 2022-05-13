package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNodeWithNext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingNextRightPointersInEachNodeIITest {

    private final PopulatingNextRightPointersInEachNodeII testObject = new PopulatingNextRightPointersInEachNodeII();

    @Test
    public void testConnect() {
        TreeNodeWithNext root = new TreeNodeWithNext(1);
        root.left = new TreeNodeWithNext(2);
        root.right = new TreeNodeWithNext(3);
        root.left.left = new TreeNodeWithNext(4);
        root.left.right = new TreeNodeWithNext(5);
        root.right.right = new TreeNodeWithNext(7);
        TreeNodeWithNext expected = testObject.connect(root);
        assertNull(expected.next);
        assertEquals(expected.next, root.right);
    }
}