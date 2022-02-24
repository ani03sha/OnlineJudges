package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListTest {

    private final SortList testObject = new SortList();

    @Test
    public void testSortList() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode expected = testObject.sortList(head);
        assertEquals(1, expected.val);
        assertEquals(2, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);

        head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        expected = testObject.sortList(head);
        assertEquals(-1, expected.val);
        assertEquals(0, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(4, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);
    }
}