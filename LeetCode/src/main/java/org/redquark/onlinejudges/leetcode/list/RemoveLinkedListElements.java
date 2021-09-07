package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        // If head has the value that needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        // Current and previous nodes
        ListNode current = head;
        ListNode previous = null;
        // Loop through the list
        while (current != null) {
            // If current nodes needs to be deleted
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return head;
    }
}
