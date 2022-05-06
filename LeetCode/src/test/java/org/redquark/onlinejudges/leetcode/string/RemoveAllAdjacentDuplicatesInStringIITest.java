package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringIITest {

    private final RemoveAllAdjacentDuplicatesInStringII testObject = new RemoveAllAdjacentDuplicatesInStringII();

    @Test
    public void testRemoveDuplicates() {
        String s = "abcd";
        int k = 2;
        assertEquals("abcd", testObject.removeDuplicates(s, k));

        s = "deeedbbcccbdaa";
        k = 3;
        assertEquals("aa", testObject.removeDuplicates(s, k));

        s = "pbbcggttciiippooaais";
        k = 2;
        assertEquals("ps", testObject.removeDuplicates(s, k));
    }
}