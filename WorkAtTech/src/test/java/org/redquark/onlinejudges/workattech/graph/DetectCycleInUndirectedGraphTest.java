package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DetectCycleInUndirectedGraphTest {

    private final DetectCycleInUndirectedGraph testObject = new DetectCycleInUndirectedGraph();

    @Test
    @SuppressWarnings("unchecked")
    public void testIsCyclic() {
        ArrayList<Integer>[] adjList = new ArrayList[7];
        adjList[0] = new ArrayList<>() {{
            add(1);
            add(3);
            add(6);
        }};
        adjList[1] = new ArrayList<>() {{
            add(0);
            add(2);
            add(4);
        }};
        adjList[2] = new ArrayList<>() {{
            add(1);
        }};
        adjList[3] = new ArrayList<>() {{
            add(0);
        }};
        adjList[4] = new ArrayList<>() {{
            add(1);
            add(5);
        }};
        adjList[5] = new ArrayList<>() {{
            add(4);
        }};
        adjList[6] = new ArrayList<>() {{
            add(0);
        }};
        assertFalse(testObject.isCyclic(adjList));
    }
}