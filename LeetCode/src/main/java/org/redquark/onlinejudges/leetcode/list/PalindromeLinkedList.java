package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

public class PalindromeLinkedList {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public boolean isPalindrome(ListNode head) {
        // Special case
        if (head == null) {
            return true;
        }
        // 1. Find the middle of the linked list
        // Slow and left pointers to find the middle of the list
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Head of the second half
        ListNode secondHead = slow.next;
        // 3. Detach the first half of the list from the second half
        slow.next = null;
        // 4. Reverse the second half of the list
        ListNode previous = null;
        ListNode current = secondHead;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        // 5. Compare the two halves. If any of the nodes are not equal,
        // we will return false, true otherwise.
        secondHead = previous;
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }
}
