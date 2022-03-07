package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    private final AddTwoNumbers testObject = new AddTwoNumbers();

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode expected = testObject.addTwoNumbers(l1, l2);
        assertEquals(7, expected.val);
        assertEquals(0, expected.next.val);
        assertEquals(8, expected.next.next.val);

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        expected = testObject.addTwoNumbers(l1, l2);
        assertEquals(0, expected.val);

        l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        expected = testObject.addTwoNumbers(l1, l2);
        assertEquals(8, expected.val);
        assertEquals(9, expected.next.val);
        assertEquals(9, expected.next.next.val);
        assertEquals(9, expected.next.next.next.val);
        assertEquals(0, expected.next.next.next.next.val);
        assertEquals(0, expected.next.next.next.next.next.val);
        assertEquals(0, expected.next.next.next.next.next.next.val);
        assertEquals(1, expected.next.next.next.next.next.next.next.val);
    }
}