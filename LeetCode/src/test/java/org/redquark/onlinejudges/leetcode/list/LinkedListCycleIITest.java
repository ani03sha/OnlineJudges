package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListCycleIITest {

    private final LinkedListCycleII testObject = new LinkedListCycleII();

    @Test
    public void testDetectCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertEquals(2, testObject.detectCycle(head).val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertEquals(1, testObject.detectCycle(head).val);

        head = new ListNode(1);
        assertNull(testObject.detectCycle(head));
    }
}