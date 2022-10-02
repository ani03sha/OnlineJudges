package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    public void testIsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(palindromeLinkedList.isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(palindromeLinkedList.isPalindrome(head));
    }
}