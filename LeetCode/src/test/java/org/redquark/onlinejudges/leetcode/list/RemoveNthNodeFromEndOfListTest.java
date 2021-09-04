package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList testObject = new RemoveNthNodeFromEndOfList();

    @Test
    public void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode expected = testObject.removeNthFromEnd(head, n);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(5, expected.next.next.next.val);

        head = new ListNode(1);
        n = 1;
        assertNull(testObject.removeNthFromEnd(head, n));

        head = new ListNode(1);
        head.next = new ListNode(2);
        expected = testObject.removeNthFromEnd(head, n);
        assertEquals(1, expected.val);
    }
}