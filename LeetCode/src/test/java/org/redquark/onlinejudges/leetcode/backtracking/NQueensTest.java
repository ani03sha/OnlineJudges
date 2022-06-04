package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueensTest {

    private final NQueens testObject = new NQueens();

    @Test
    public void testSolveNQueens() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        assertEquals(expected, testObject.solveNQueens(4));

        expected = new ArrayList<>();
        expected.add(Collections.singletonList("Q"));
        assertEquals(expected, testObject.solveNQueens(1));
    }
}