package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeKSortedListsTest {

    private final MergeKSortedLists testObject = new MergeKSortedLists();

    @Test
    public void testMergeKLists() {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);
        ListNode[] lists = new ListNode[]{head1, head2, head3};
        ListNode expected = testObject.mergeKLists(lists);
        assertEquals(1, expected.val);
        assertEquals(1, expected.next.val);
        assertEquals(2, expected.next.next.val);
        assertEquals(3, expected.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.next.next.val);
        assertEquals(6, expected.next.next.next.next.next.next.next.val);

        lists = new ListNode[]{};
        assertNull(testObject.mergeKLists(lists));

        lists = new ListNode[]{null};
        assertNull(testObject.mergeKLists(lists));
    }
}