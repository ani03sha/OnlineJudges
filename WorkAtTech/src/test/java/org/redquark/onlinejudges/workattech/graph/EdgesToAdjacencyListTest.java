package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EdgesToAdjacencyListTest {

    private final EdgesToAdjacencyList testObject = new EdgesToAdjacencyList();

    @Test
    @SuppressWarnings("unchecked")
    public void testEdgesToAdjList() {
        int n = 4;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {0, 3}
        };
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
            add(2);
            add(0);
        }};
        assertArrayEquals(expected, testObject.edgesToAdjList(n, edges));
    }
}