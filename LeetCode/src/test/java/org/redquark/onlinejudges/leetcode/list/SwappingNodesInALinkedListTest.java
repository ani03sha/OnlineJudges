package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwappingNodesInALinkedListTest {

    private final SwappingNodesInALinkedList testObject = new SwappingNodesInALinkedList();

    @Test
    public void testSwapNodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode expected = testObject.swapNodes(head, k);
        assertEquals(1, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(5, expected.next.next.next.next.val);
    }
}