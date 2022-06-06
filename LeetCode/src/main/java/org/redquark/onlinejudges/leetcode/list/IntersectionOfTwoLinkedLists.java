package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNode;

/**
 * @author Anirudh Sharma
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Special case
        if (headA == null || headB == null) {
            return null;
        }
        // Lengths of both lists
        int lengthA = 0;
        int lengthB = 0;
        // Reference of both heads
        ListNode tempA = headA;
        ListNode tempB = headB;
        // Calculate the length of both lists
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        // Calculate the difference between the two lengths
        int difference = Math.abs(lengthA - lengthB);
        // Traverse "difference" number of nodes in the
        // bigger list
        if (lengthA > lengthB) {
            tempA = headA;
            while (difference-- > 0) {
                tempA = tempA.next;
            }
            tempB = headB;
        } else {
            tempB = headB;
            while (difference-- > 0) {
                tempB = tempB.next;
            }
            tempA = headA;
        }
        // At this point, both lists have equal number of
        // nodes remaining to traverse
        // Loop through both the lists until nodes are matched
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
