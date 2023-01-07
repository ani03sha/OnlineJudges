package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BFSOfAGraphTest {

    private final BFSOfAGraph testObject = new BFSOfAGraph();

    @Test
    @SuppressWarnings("unchecked")
    public void testBfs() {
        ArrayList<Integer>[] adjList = new ArrayList[4];
        adjList[0] = new ArrayList<>() {{
            add(3);
            add(1);
            add(2);
            add(3);
        }};
        adjList[1] = new ArrayList<>() {{
            add(1);
            add(0);
        }};
        adjList[2] = new ArrayList<>() {{
            add(2);
            add(0);
            add(3);
        }};
        adjList[3] = new ArrayList<>() {{
            add(2);
            add(0);
            add(2);
        }};
        ArrayList<Integer> expected = new ArrayList<>() {{
            add(0);
            add(3);
            add(1);
            add(2);
        }};
        assertEquals(expected, testObject.bfs(adjList));
    }
}