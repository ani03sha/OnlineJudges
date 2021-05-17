package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {

    private final UniquePaths testObject = new UniquePaths();

    @Test
    public void testUniquePaths() {
        int m = 3;
        int n = 7;
        assertEquals(28, testObject.uniquePaths(m, n));

        m = 3;
        n = 3;
        assertEquals(6, testObject.uniquePaths(m, n));
    }
}