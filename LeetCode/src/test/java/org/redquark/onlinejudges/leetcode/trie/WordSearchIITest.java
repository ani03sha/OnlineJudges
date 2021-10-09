package org.redquark.onlinejudges.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSearchIITest {

    private final WordSearchII testObject = new WordSearchII();

    @Test
    public void testFindWords() {
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[]{"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("oath", "eat");
        assertEquals(expected, testObject.findWords(board, words));

        board = new char[][]{
                {'a', 'b'},
                {'c', 'd'}
        };
        words = new String[]{"abcb"};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.findWords(board, words));
    }
}