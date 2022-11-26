package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumHeightTreesTest {

    private final MinimumHeightTrees testObject = new MinimumHeightTrees();

    @Test
    public void testFindMinHeightTrees() {
        int n = 4;
        int[][] edges = new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
        };
        List<Integer> expected = List.of(1);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));

        n = 6;
        edges = new int[][]{
                {3, 0},
                {3, 1},
                {3, 2},
                {3, 4},
                {5, 4}
        };
        expected = List.of(3, 4);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));

        n = 1;
        edges = new int[][]{};
        expected = List.of(0);
        assertEquals(expected, testObject.findMinHeightTrees(n, edges));
    }
}