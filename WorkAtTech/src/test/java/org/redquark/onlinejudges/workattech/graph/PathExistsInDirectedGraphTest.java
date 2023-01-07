package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathExistsInDirectedGraphTest {

    private final PathExistsInDirectedGraph testObject = new PathExistsInDirectedGraph();

    @Test
    @SuppressWarnings("unchecked")
    public void testPathExists() {
        ArrayList<Integer>[] adjList = new ArrayList[4];
        adjList[0] = new ArrayList<>() {{
            add(1);
        }};
        adjList[1] = new ArrayList<>() {{
            add(2);
            add(0);
        }};
        adjList[2] = new ArrayList<>() {{
            add(0);
            add(3);
        }};
        adjList[3] = new ArrayList<>() {{
            add(1);
        }};
        assertTrue(testObject.pathExists(adjList));
    }
}