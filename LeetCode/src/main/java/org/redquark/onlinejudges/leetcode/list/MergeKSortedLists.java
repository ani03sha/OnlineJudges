package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        // Special case
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        // Boundary cases
        if (start == end) {
            return lists[start];
        }
        // Middle index
        int middle = start + (end - start) / 2;
        // Recurse for left and right parts of the array
        ListNode left = mergeKLists(lists, start, middle);
        ListNode right = mergeKLists(lists, middle + 1, end);
        // Mow merge left and right lists
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        // Dummy head
        ListNode head = new ListNode(-1);
        // Reference of the head
        ListNode temp = head;
        // Loop until any of the list becomes empty
        while (left != null && right != null) {
            // Compare the values in the current nodes
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        // Take all the nodes from the left list, if remaining
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        // Take all the nodes from the right list, if remaining
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return head.next;
    }
}
