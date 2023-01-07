package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLadderTest {

    private final WordLadder testObject = new WordLadder();

    @Test
    public void testShortestLadderLength() {
        String beginWord = "work";
        String endWord = "tech";
        String[] wordList = new String[]{"toch", "worh", "wock", "woch", "tech", "werh"};
        assertEquals(5, testObject.shortestLadderLength(beginWord, endWord, wordList));

        beginWord = "black";
        endWord = "white";
        wordList = new String[]{"aracz", "blacz", "bracz", "ahacz", "white", "ahace", "ahice"};
        assertEquals(0, testObject.shortestLadderLength(beginWord, endWord, wordList));
    }
}