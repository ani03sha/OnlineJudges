package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringTest {

    private final RemoveAllAdjacentDuplicatesInString testObject = new RemoveAllAdjacentDuplicatesInString();

    @Test
    void testRemoveDuplicates() {
        String s = "abbaca";
        assertEquals("ca", testObject.removeDuplicates(s));

        s = "azxxzy";
        assertEquals("ay", testObject.removeDuplicates(s));
    }
}