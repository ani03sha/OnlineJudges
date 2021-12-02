package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // References of the odd and even lists
        ListNode odd = head;
        ListNode even = head.next;
        // Reference of the head of the even list
        ListNode evenHead = even;
        // Loop until the end of the list
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
