package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle node of the list using slow and
        // fast pointer technique
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // At this point, slow node will represent the middle node
        // Heads of left and right lists
        ListNode left = head;
        ListNode right = slow.next;
        // Disconnect left list from the right list
        slow.next = null;
        // Sort recursively
        left = sortList(left);
        right = sortList(right);
        // Merge both lists
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        // Dummy node
        ListNode dummy = new ListNode(-1);
        // Node to traverse the list
        ListNode current = dummy;
        // Loop through left and right lists
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        // Traverse through the remaining nodes in the left list
        while (left != null) {
            current.next = left;
            left = left.next;
            current = current.next;
        }
        // Traverse through the remaining nodes in the right list
        while (right != null) {
            current.next = right;
            right = right.next;
            current = current.next;
        }
        return dummy.next;
    }
}
