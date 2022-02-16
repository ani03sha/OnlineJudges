package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SwapNodesInPairsTest {

    private final SwapNodesInPairs testObject = new SwapNodesInPairs();

    @Test
    public void testSwapPairs() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode expected = testObject.swapPairs(head);
        assertEquals(2, expected.val);
        assertEquals(1, expected.next.val);
        assertEquals(4, expected.next.next.val);
        assertEquals(3, expected.next.next.next.val);

        head = new ListNode(1);
        expected = testObject.swapPairs(head);
        assertEquals(1, expected.val);

        assertNull(testObject.swapPairs(null));
    }
}