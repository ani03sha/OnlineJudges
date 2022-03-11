package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListTest {

    private final RotateList testObject = new RotateList();

    @Test
    public void testRotateRight() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode expected = testObject.rotateRight(head, k);
        assertEquals(4, expected.val);
        assertEquals(5, expected.next.val);
        assertEquals(1, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(3, expected.next.next.next.next.val);

        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        k = 4;
        expected = testObject.rotateRight(head, k);
        assertEquals(2, expected.val);
        assertEquals(0, expected.next.val);
        assertEquals(1, expected.next.next.val);
    }
}