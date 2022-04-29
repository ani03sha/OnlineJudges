package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsGraphBipartiteTest {

    private final IsGraphBipartite testObject = new IsGraphBipartite();

    @Test
    public void testIsBipartite() {
        int[][] graph = new int[][]{
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2}
        };
        assertFalse(testObject.isBipartite(graph));

        graph = new int[][]{
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        assertTrue(testObject.isBipartite(graph));
    }
}