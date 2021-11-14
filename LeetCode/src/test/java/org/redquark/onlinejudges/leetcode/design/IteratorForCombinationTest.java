package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.design.IteratorForCombination.CombinationIterator;

public class IteratorForCombinationTest {

    @Test
    public void test() {
        CombinationIterator testObject = new CombinationIterator("abc", 2);
        assertEquals("ab", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("ac", testObject.next());
        assertTrue(testObject.hasNext());
        assertEquals("bc", testObject.next());
        assertFalse(testObject.hasNext());
    }

}