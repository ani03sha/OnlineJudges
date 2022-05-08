package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.onlinejudges.leetcode.design.FlattenNestedListIterator.NestedIterator;

public class FlattenNestedListIteratorTest {

    @Test
    public void test() {
        NestedIterator testObject = new NestedIterator(null);
        assertFalse(testObject.hasNext());
        assertNull(testObject.next());
    }
}