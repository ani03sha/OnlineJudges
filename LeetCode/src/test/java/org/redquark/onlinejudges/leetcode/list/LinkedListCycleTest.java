package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    private final LinkedListCycle testObject = new LinkedListCycle();

    @Test
    public void testHasCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertTrue(testObject.hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertTrue(testObject.hasCycle(head));

        head = new ListNode(1);
        assertFalse(testObject.hasCycle(head));
    }
}