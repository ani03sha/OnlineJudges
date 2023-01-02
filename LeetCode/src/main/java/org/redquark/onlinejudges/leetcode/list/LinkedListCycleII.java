    package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return null;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until fast reaches the end or the pointers meet
        while (fast != null && fast.next != null) {
            // Move slow one step ahead
            slow = slow.next;
            // Move fast two steps ahead
            fast = fast.next.next;
            // If both pointers are pointing to the same node then it
            // is the one where cycle starts
            if (slow == fast) {
                break;
            }
        }
        // Now, we will find out the reference of the node from where
        // the cycle starts by moving both nodes at equal pace
        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        // If we reach here, it means there is no cycle
        return null;
    }
}
