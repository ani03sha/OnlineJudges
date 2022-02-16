package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Dummy node
        ListNode dummy = new ListNode(-1);
        // Point the next of dummy node to the current head
        dummy.next = head;
        // Pointer to traverse the list
        ListNode current = dummy;
        // Loop through the linked list
        while (current.next != null && current.next.next != null) {
            // First node of the pair
            ListNode first = current.next;
            // Second node of the pairt
            ListNode second = current.next.next;
            // We are going to swap here by pointing the next
            // of the first node to the next of the current
            // second node
            first.next = second.next;
            // Point next of second node to the first
            second.next = first;
            // Update next of current as the current second
            current.next = second;
            // Move current node two steps ahead
            current = current.next.next;
        }
        return dummy.next;
    }
}
