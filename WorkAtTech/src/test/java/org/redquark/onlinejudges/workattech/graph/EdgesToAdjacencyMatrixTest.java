package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EdgesToAdjacencyMatrixTest {

    private final EdgesToAdjacencyMatrix testObject = new EdgesToAdjacencyMatrix();

    @Test
    public void testEdgesToMatrix() {
        int n = 4;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {0, 3}
        };
        int[][] expected = new int[][]{
                {0, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        assertArrayEquals(expected, testObject.edgesToMatrix(n, edges));
    }
}