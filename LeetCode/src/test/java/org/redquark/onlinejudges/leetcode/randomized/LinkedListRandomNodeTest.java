package org.redquark.onlinejudges.leetcode.randomized;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListRandomNodeTest {

    @Test
    void getRandom() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        LinkedListRandomNode testObject = new LinkedListRandomNode(head);
        assertTrue(testObject.getRandom() >= 1 && testObject.getRandom() <= 3);
        assertTrue(testObject.getRandom() >= 1 && testObject.getRandom() <= 3);
        assertTrue(testObject.getRandom() >= 1 && testObject.getRandom() <= 3);
        assertTrue(testObject.getRandom() >= 1 && testObject.getRandom() <= 3);
    }
}