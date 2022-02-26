package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathVisitingAllNodesTest {

    private final ShortestPathVisitingAllNodes testObject = new ShortestPathVisitingAllNodes();

    @Test
    public void testShortestPathLength() {
        int[][] graph = new int[][]{
                {1, 2, 3},
                {0},
                {0},
                {0}
        };
        assertEquals(4, testObject.shortestPathLength(graph));

        graph = new int[][]{
                {1},
                {0, 2, 4},
                {1, 3, 4},
                {2},
                {1, 2}
        };
        assertEquals(4, testObject.shortestPathLength(graph));
    }
}