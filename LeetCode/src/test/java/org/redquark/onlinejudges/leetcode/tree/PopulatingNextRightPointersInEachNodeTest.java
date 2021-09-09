package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNodeWithNext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulatingNextRightPointersInEachNodeTest {

    private final PopulatingNextRightPointersInEachNode testObject = new PopulatingNextRightPointersInEachNode();

    @Test
    public void testConnect() {
        TreeNodeWithNext root = new TreeNodeWithNext(1);
        root.left = new TreeNodeWithNext(2);
        root.right = new TreeNodeWithNext(3);
        root.left.left = new TreeNodeWithNext(4);
        root.left.right = new TreeNodeWithNext(5);
        root.right.left = new TreeNodeWithNext(6);
        root.right.right = new TreeNodeWithNext(7);

        TreeNodeWithNext expected = testObject.connect(root);

        assertNull(expected.next);
        assertEquals(3, expected.left.next.val);
        assertNull(expected.right.next);
        assertEquals(5, expected.left.left.next.val);
        assertEquals(6, expected.left.right.next.val);
        assertEquals(7, expected.right.left.next.val);
        assertNull(expected.right.right.next);

        expected = testObject.connect(null);
        assertNull(expected);
    }
}