package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class SwappingNodesInALinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        // Base case
        if (head == null) {
            return null;
        }
        // Temp nodes
        ListNode tempA = head;
        ListNode tempB = head;
        // Kth node
        ListNode kthNode;
        // Traverse the node from the start
        for (int i = 1; i < k; i++) {
            tempA = tempA.next;
        }
        kthNode = tempA;
        tempA = tempA.next;
        // Loop until the tempA reaches end
        while (tempA != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        // Get the value in the kth node
        int value = kthNode.val;
        kthNode.val = tempB.val;
        tempB.val = value;
        return head;
    }
}
