package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately testObject = new MergeStringsAlternately();

    @Test
    public void testMergeAlternately() {
        String word1 = "abc";
        String word2 = "pqr";
        assertEquals("apbqcr", testObject.mergeAlternately(word1, word2));

        word1 = "ab";
        word2 = "pqrs";
        assertEquals("apbqrs", testObject.mergeAlternately(word1, word2));

        word1 = "abcd";
        word2 = "pq";
        assertEquals("apbqcd", testObject.mergeAlternately(word1, word2));
    }
}