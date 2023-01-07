package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CaptureSurroundedRegionsTest {

    private final CaptureSurroundedRegions testObject = new CaptureSurroundedRegions();

    @Test
    public void testGetFinalBoard() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X'}
        };
        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X'}
        };
        assertArrayEquals(expected, testObject.getFinalBoard(board));
    }
}