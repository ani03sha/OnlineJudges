package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists testObject = new MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode expected = testObject.mergeTwoLists(head1, head2);

        assertEquals(1, expected.val);
        assertEquals(1, expected.next.val);
        assertEquals(2, expected.next.next.val);
        assertEquals(3, expected.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.next.val);

        assertNull(testObject.mergeTwoLists(null, null));

        head1 = null;
        head2 = new ListNode(0);
        expected = testObject.mergeTwoLists(head1, head2);
        assertEquals(0, expected.val);
    }
}