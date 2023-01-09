package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSearchBoardTest {

    private final WordSearchBoard testObject = new WordSearchBoard();

    @Test
    public void testWordExists() {
        String word = "WORKAT";
        char[][] board = new char[][]{
                {'A', 'W', 'O', 'R'},
                {'T', 'E', 'R', 'K'},
                {'T', 'A', 'K', 'A'}
        };
        assertTrue(testObject.wordExists(board, word));

        word = "ATTECH";
        board = new char[][]{
                {'A', 'W', 'O', 'R'},
                {'T', 'E', 'R', 'K'},
                {'T', 'A', 'K', 'A'}
        };
        assertFalse(testObject.wordExists(board, word));
    }
}