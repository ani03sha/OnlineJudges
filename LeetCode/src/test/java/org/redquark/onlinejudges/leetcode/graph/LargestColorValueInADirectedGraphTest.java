package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestColorValueInADirectedGraphTest {

    private final LargestColorValueInADirectedGraph testObject = new LargestColorValueInADirectedGraph();

    @Test
    public void testLargestPathValue() {
        String colors = "abaca";
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(3, testObject.largestPathValue(colors, edges));

        colors = "a";
        edges = new int[][]{
                {0, 0}
        };
        assertEquals(-1, testObject.largestPathValue(colors, edges));

    }
}