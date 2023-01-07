package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AdjacencyMatrixToAdjacencyListTest {

    private final AdjacencyMatrixToAdjacencyList testObject = new AdjacencyMatrixToAdjacencyList();

    @Test
    @SuppressWarnings("unchecked")
    public void testMatrixToAdjList() {
        int[][] matrix = new int[][]{
                {0, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 0, 1, 0}
        };
        int n = 4;
        ArrayList<Integer>[] expected = new ArrayList[4];
        expected[0] = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        expected[1] = new ArrayList<>() {{
            add(0);
        }};
        expected[2] = new ArrayList<>() {{
            add(0);
            add(3);
        }};
        expected[3] = new ArrayList<>() {{
            add(0);
            add(2);
        }};
        assertArrayEquals(expected, testObject.matrixToAdjList(n, matrix));
    }
}