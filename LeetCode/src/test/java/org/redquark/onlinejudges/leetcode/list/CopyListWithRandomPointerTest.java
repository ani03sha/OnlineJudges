package org.redquark.onlinejudges.leetcode.list;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.ListNodeWithRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CopyListWithRandomPointerTest {

    private final CopyListWithRandomPointer testObject = new CopyListWithRandomPointer();

    @Test
    public void testCopyRandomList() {
        ListNodeWithRandom head = new ListNodeWithRandom(7);
        head.next = new ListNodeWithRandom(13);
        head.next.next = new ListNodeWithRandom(11);
        head.next.next.next = new ListNodeWithRandom(10);
        head.next.next.next.next = new ListNodeWithRandom(1);
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;
        ListNodeWithRandom expected = testObject.copyRandomList(head);
        assertEquals(7, expected.val);
        assertEquals(13, expected.next.val);
        assertEquals(11, expected.next.next.val);
        assertEquals(10, expected.next.next.next.val);
        assertEquals(1, expected.next.next.next.next.val);
        assertEquals(expected, expected.next.random);
        assertEquals(expected.next.next.next.next, expected.next.next.random);
        assertEquals(expected.next.next, expected.next.next.next.random);
        assertEquals(expected, expected.next.next.next.next.random);
    }
}