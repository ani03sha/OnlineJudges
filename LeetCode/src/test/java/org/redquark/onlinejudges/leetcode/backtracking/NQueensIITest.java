package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueensIITest {

    private final NQueensII testObject = new NQueensII();

    @Test
    public void testTotalNQueens() {
        assertEquals(2, testObject.totalNQueens(4));
    }
}