package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    @Test
    public void test() {
        LRUCache testObject = new LRUCache(2);
        testObject.put(1, 1);
        testObject.put(2, 2);
        assertEquals(1, testObject.get(1));
        testObject.put(3, 3);
        assertEquals(-1, testObject.get(2));
        testObject.put(4, 4);
        assertEquals(-1, testObject.get(1));
        assertEquals(3, testObject.get(3));
        assertEquals(4, testObject.get(4));
    }

}