package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestStringChainTest {

    private final LongestStringChain testObject = new LongestStringChain();

    @Test
    public void testLongestStrChain() {
        String[] words = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};
        assertEquals(4, testObject.longestStrChain(words));

        words = new String[]{"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        assertEquals(5, testObject.longestStrChain(words));

        words = new String[]{"abcd", "dbqca"};
        assertEquals(1, testObject.longestStrChain(words));
    }
}