package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedListIITest {

    private final RemoveDuplicatesFromSortedListII testObject = new RemoveDuplicatesFromSortedListII();

    @Test
    public void testDeleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode expected = testObject.deleteDuplicates(head);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(5, expected.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        expected = testObject.deleteDuplicates(head);
        assertEquals(2, expected.val);
        assertEquals(3, expected.next.val);
    }
}