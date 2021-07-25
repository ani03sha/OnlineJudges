package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LFUCacheTest {

    @Test
    public void test() {
        LFUCache testObject = new LFUCache(2);
        testObject.put(1, 1);
        testObject.put(2, 2);
        assertEquals(1, testObject.get(1));
        testObject.put(3, 3);
        assertEquals(-1, testObject.get(2));
        assertEquals(3, testObject.get(3));
        testObject.put(4, 4);
        assertEquals(-1, testObject.get(1));
        assertEquals(3, testObject.get(3));
        assertEquals(4, testObject.get(4));

        testObject = new LFUCache(3);
        testObject.put(2, 2);
        testObject.put(1, 1);
        assertEquals(2, testObject.get(2));
        assertEquals(1, testObject.get(1));
        assertEquals(2, testObject.get(2));
        testObject.put(3, 3);
        testObject.put(4, 4);
        assertEquals(-1, testObject.get(3));
        assertEquals(2, testObject.get(2));
        assertEquals(1, testObject.get(1));
        assertEquals(4, testObject.get(4));
    }
}