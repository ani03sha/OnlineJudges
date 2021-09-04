package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Special case
        if (head == null) {
            return null;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop fast pointers n node ahead
        for (int i = 0; i < n; i++) {
            if (fast.next == null) {
                // If n is equal to the number of nodes, delete head
                if (i == n - 1) {
                    head = head.next;
                }
                return head;
            }
            fast = fast.next;
        }
        // Loop until the fast pointer reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Delink next node of slow
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
