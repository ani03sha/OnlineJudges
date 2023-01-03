package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AdjacencyListToAdjacencyMatrixTest {

    private final AdjacencyListToAdjacencyMatrix testObject = new AdjacencyListToAdjacencyMatrix();

    @Test
    @SuppressWarnings("unchecked")
    public void testAdjListToMatrix() {
        int n = 4;
        ArrayList<Integer>[] adjacencyList = new ArrayList[4];
        adjacencyList[0] = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        adjacencyList[1] = new ArrayList<>() {{
            add(0);
        }};
        adjacencyList[2] = new ArrayList<>() {{
            add(0);
            add(3);
        }};
        adjacencyList[3] = new ArrayList<>() {{
            add(0);
            add(2);
        }};
        int[][] expected = new int[][]{
                {0, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        assertArrayEquals(expected, testObject.adjListToMatrix(n, adjacencyList));
    }
}