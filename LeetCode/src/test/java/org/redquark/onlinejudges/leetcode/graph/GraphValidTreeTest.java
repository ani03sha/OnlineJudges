package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphValidTreeTest {

    private final GraphValidTree testObject = new GraphValidTree();

    @Test
    public void testValidTree() {
        int n = 5;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 4}
        };
        assertTrue(testObject.validTree(n, edges));

        edges = new int[][]{
                {0, 1},
                {1, 2},
                {2, 3},
                {1, 3},
                {1, 4}
        };
        assertFalse(testObject.validTree(n, edges));
    }
}