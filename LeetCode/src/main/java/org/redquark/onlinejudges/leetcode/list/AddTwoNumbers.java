package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Special cases
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // Dummy node previous to the head node
        ListNode dummy = new ListNode(-1);
        // Variable to keep track of the sum linked list
        ListNode temp = dummy;
        // Variable for carry
        int carry = 0;
        // Loop until both lists have nodes
        while (l1 != null && l2 != null) {
            // Sum of the current nodes
            int sum = carry + l1.val + l2.val;
            // Create a new node with the value
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            // Update carry
            carry = sum / 10;
            // Move the list nodes
            l1 = l1.next;
            l2 = l2.next;
        }
        // Process remaining nodes, if any
        while (l1 != null) {
            int sum = carry + l1.val;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = carry + l2.val;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;
            l2 = l2.next;
        }
        // Check if still carry remains
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
