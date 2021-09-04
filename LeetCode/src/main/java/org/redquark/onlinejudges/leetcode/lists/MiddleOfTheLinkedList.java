package org.redquark.onlinejudges.leetcode.lists;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until fast reaches the end of the list
        while (fast != null && fast.next != null) {
            // Move slow pointer one node ahead
            slow = slow.next;
            // Move fast pointer two nodes ahead
            fast = fast.next.next;
        }
        return slow;
    }
}
