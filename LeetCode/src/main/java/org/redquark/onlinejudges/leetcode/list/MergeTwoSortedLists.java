package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // Special cases
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        // Head of the merged list
        ListNode head;
        // Pointer to loop through the merged list
        ListNode temp;
        // Decide the head of the final list
        if (head1.val < head2.val) {
            // Create a new node
            temp = new ListNode(head1.val);
            head = temp;
            head1 = head1.next;
        } else {
            // Create a new node
            temp = new ListNode(head2.val);
            head = temp;
            head2 = head2.next;
        }
        // Loop until we reach to the end of either of the list
        while (head1 != null && head2 != null) {
            // Choose the node with the smaller value
            if (head1.val < head2.val) {
                temp.next = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                temp.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            temp = temp.next;
        }
        // For the remaining nodes in first list
        while (head1 != null) {
            temp.next = new ListNode(head1.val);
            head1 = head1.next;
            temp = temp.next;
        }
        // For the remaining nodes in second list
        while (head2 != null) {
            temp.next = new ListNode(head2.val);
            head2 = head2.next;
            temp = temp.next;
        }
        return head;
    }
}
