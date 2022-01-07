package org.redquark.onlinejudges.leetcode.randomized;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class LinkedListRandomNode {

    private final ListNode head;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        // Variable to store the output
        int output = 0;
        // Counter to keep track of count of nodes.
        // It is 1 because we have at least head node.
        int count = 1;
        // Reference to the head node to traverse the list.
        ListNode temp = head;
        // Loop through the list
        while (temp != null) {
            // Now, here we need to decide if we wish to choose
            // the current node or not.
            if (1.0 / count > Math.random()) {
                output = temp.val;
            }
            count++;
            temp = temp.next;
        }
        return output;
    }
}
