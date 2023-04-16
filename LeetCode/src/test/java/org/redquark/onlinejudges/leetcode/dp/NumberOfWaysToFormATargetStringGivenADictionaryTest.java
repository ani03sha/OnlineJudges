package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfWaysToFormATargetStringGivenADictionaryTest {

    private final NumberOfWaysToFormATargetStringGivenADictionary testObject = new NumberOfWaysToFormATargetStringGivenADictionary();

    @Test
    public void testNumWays() {
        String[] words = new String[]{"acca", "bbbb", "caca"};
        String target = "aba";
        assertEquals(6, testObject.numWays(words, target));

        words = new String[]{"abba", "baab"};
        target = "bab";
        assertEquals(4, testObject.numWays(words, target));
    }
}