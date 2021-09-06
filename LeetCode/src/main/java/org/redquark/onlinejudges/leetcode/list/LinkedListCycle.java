package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // Special case
        if (head == null) {
            return false;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until the two pointers meet or we
        // reach to the end of the list
        while (fast != null && fast.next != null) {
            // Move slow one pointer ahead
            slow = slow.next;
            // Move fast two pointers ahead
            fast = fast.next.next;
            // Check if the slow and fast are same
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
