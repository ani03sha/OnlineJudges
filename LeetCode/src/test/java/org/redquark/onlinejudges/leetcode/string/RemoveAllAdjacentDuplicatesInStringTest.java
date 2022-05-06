package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringTest {

    private final RemoveAllAdjacentDuplicatesInString testObject = new RemoveAllAdjacentDuplicatesInString();

    @Test
    void testRemoveDuplicatesOne() {
        String s = "abbaca";
        assertEquals("ca", testObject.removeDuplicatesOne(s));

        s = "azxxzy";
        assertEquals("ay", testObject.removeDuplicatesOne(s));
    }

    @Test
    void testRemoveDuplicatesTwo() {
        String s = "abbaca";
        assertEquals("ca", testObject.removeDuplicatesTwo(s));

        s = "azxxzy";
        assertEquals("ay", testObject.removeDuplicatesTwo(s));
    }
}