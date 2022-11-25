package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfConnectedComponentsInAnUndirectedGraphTest {

    private final NumberOfConnectedComponentsInAnUndirectedGraph testObject = new NumberOfConnectedComponentsInAnUndirectedGraph();

    @Test
    public void testCountComponents() {
        int n = 5;
        int[][] edges = new int[][]{
                {0, 1},
                {1, 2},
                {3, 4}
        };
        assertEquals(2, testObject.countComponents(n, edges));

        n = 5;
        edges = new int[][]{
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(1, testObject.countComponents(n, edges));

        n = 9;
        edges = new int[][]{
                {0, 1},
                {1, 2},
                {3, 4},
                {4, 5},
                {6, 7},
                {7, 8}
        };
        assertEquals(3, testObject.countComponents(n, edges));
    }
}