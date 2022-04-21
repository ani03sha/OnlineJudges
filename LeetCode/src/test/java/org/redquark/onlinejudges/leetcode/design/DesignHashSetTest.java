package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.design.DesignHashSet.MyHashSet;

public class DesignHashSetTest {

    @Test
    public void test() {
        MyHashSet testObject = new MyHashSet();
        testObject.add(1);
        testObject.add(2);
        assertTrue(testObject.contains(1));
        assertFalse(testObject.contains(3));
        testObject.add(2);
        assertTrue(testObject.contains(2));
        testObject.remove(2);
        assertFalse(testObject.contains(2));
    }
}