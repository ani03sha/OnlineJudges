package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Pointer to traverse through the list
        ListNode temp = head;
        // Find the length of the linked list
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        // In case k > n, we should offset k
        k = k % n;
        // Logic to find nth node from end
        // Fast pointer will move k positions ahead
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        // Move both pointers until the fast pointer
        // reaches to the end of the list
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Point the last node to the current head
        fast.next = head;
        // Make next of slow pointer as the new head
        head = slow.next;
        // Disconnect the original link of slow pointer
        slow.next = null;
        return head;
    }
}
