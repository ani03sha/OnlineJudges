package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.design.InsertDeleteGetRandomO1DuplicatesAllowed.RandomizedCollection;

public class InsertDeleteGetRandomO1DuplicatesAllowedTest {

    @Test
    public void test() {
        RandomizedCollection testObject = new RandomizedCollection();
        assertTrue(testObject.insert(1));
        assertFalse(testObject.insert(1));
        assertTrue(testObject.insert(2));
        assertTrue(testObject.getRandom() == 1 || testObject.getRandom() == 2);
        assertTrue(testObject.remove(1));
        assertTrue(testObject.getRandom() == 1 || testObject.getRandom() == 2);
    }
}