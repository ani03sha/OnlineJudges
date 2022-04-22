package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.design.DesignHashMap.MyHashMap;

public class DesignHashMapTest {

    @Test
    public void test() {
        MyHashMap testObject = new MyHashMap();
        testObject.put(1, 1);
        testObject.put(2, 2);
        assertEquals(1, testObject.get(1));
        assertEquals(-1, testObject.get(3));
        testObject.put(2, 1);
        assertEquals(1, testObject.get(2));
        testObject.remove(2);
        assertEquals(-1, testObject.get(2));
    }

}