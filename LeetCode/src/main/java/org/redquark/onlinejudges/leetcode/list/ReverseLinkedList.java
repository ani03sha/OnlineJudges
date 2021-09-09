package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Reference of the head
        ListNode current = head;
        // Previous node pointer
        ListNode previous = null;
        // Next node of the current node
        ListNode next;
        // Loop through all the nodes of the linked list
        while (current != null) {
            // Get the reference of the next node
            next = current.next;
            // Make the original next node as the previous node
            current.next = previous;
            // Update the previous node
            previous = current;
            current = next;
        }
        // Return the head
        return previous;
    }
}
