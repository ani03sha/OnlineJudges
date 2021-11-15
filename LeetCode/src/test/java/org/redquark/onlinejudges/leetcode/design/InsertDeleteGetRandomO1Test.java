package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.design.InsertDeleteGetRandomO1.RandomizedSet;

public class InsertDeleteGetRandomO1Test {

    @Test
    public void test() {
        RandomizedSet testObject = new RandomizedSet();
        assertTrue(testObject.insert(1));
        assertFalse(testObject.remove(2));
        assertTrue(testObject.insert(2));
        assertTrue(testObject.getRandom() == 1 || testObject.getRandom() == 2);
        assertTrue(testObject.remove(1));
        assertFalse(testObject.insert(2));
        assertEquals(2, testObject.getRandom());
    }
}