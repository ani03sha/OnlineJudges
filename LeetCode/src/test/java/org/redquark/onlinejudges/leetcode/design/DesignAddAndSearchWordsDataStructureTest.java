package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.onlinejudges.leetcode.design.DesignAddAndSearchWordsDataStructure.WordDictionary;

public class DesignAddAndSearchWordsDataStructureTest {

    @Test
    public void test() {
        WordDictionary testObject = new WordDictionary();
        testObject.addWord("bad");
        testObject.addWord("dad");
        testObject.addWord("mad");
        assertFalse(testObject.search("pad"));
        assertTrue(testObject.search("bad"));
        assertTrue(testObject.search(".ad"));
        assertTrue(testObject.search("b.."));
    }
}