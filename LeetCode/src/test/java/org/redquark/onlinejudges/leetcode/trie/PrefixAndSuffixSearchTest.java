package org.redquark.onlinejudges.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.trie.PrefixAndSuffixSearch.WordFilter;

public class PrefixAndSuffixSearchTest {

    @Test
    public void test() {
        String[] words = new String[]{"apple"};
        WordFilter testObject = new WordFilter(words);
        assertEquals(0, testObject.f("a", "e"));
    }

}