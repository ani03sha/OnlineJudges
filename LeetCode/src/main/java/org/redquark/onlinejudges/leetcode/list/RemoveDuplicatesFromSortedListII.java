package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        // Special cases
        if (head == null || head.next == null) {
            return head;
        }
        // Dummy node
        ListNode dummy = new ListNode(-1);
        // Point next of this node to the current head
        dummy.next = head;
        // Previous node and current node
        ListNode previous = dummy;
        ListNode current = head;
        // Loop through the list
        while (current != null) {
            // Compare the current node with the next node
            // for values and see if they are equal
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            // At this point, we should link the next of the previous to
            // the next of the current node
            // Here, we are checking if the nodes in between were deleted
            if (previous.next != current) {
                previous.next = current.next;
            }
            // If the nodes are not deleted, simply move the pointer ahead
            else {
                previous = previous.next;
            }
            // Move current node ahead
            current = current.next;
        }
        return dummy.next;
    }
}
