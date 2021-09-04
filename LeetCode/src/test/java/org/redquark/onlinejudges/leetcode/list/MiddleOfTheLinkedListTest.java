package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList testObject = new MiddleOfTheLinkedList();

    @Test
    public void testMiddleNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.middleNode(head);
        assertEquals(3, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(5, expected.next.next.val);

        head.next.next.next.next.next = new ListNode(6);
        expected = testObject.middleNode(head);
        assertEquals(4, expected.val);
        assertEquals(5, expected.next.val);
        assertEquals(6, expected.next.next.val);
    }
}