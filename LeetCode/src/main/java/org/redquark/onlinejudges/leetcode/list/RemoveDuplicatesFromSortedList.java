package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Reference to traverse through the list
        ListNode temp = head;
        // Loop through the list
        while (temp != null) {
            // Reference to the current node
            ListNode current = temp;
            // Check if we have encountered duplicates
            while (current != null && current.val == temp.val) {
                // Move pointer ahead as long as we are encoutering duplicates
                current = current.next;
            }
            // Link non-duplicates
            temp.next = current;
            temp = temp.next;

        }
        return head;
    }
}
