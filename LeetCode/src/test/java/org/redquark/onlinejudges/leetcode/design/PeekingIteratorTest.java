package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PeekingIteratorTest {

    @Test
    public void test() {
        List<Integer> elements = Arrays.asList(1, 2, 3);
        PeekingIterator testObject = new PeekingIterator(elements.iterator());
        assertEquals(1, testObject.next());
        assertEquals(2, testObject.peek());
        assertEquals(2, testObject.next());
        assertEquals(3, testObject.next());
        assertFalse(testObject.hasNext());
    }
}