package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLadderTest {

    private final WordLadder testObject = new WordLadder();

    @Test
    public void testLadderLength() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(5, testObject.ladderLength(beginWord, endWord, wordList));

        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        assertEquals(0, testObject.ladderLength(beginWord, endWord, wordList));
    }
}