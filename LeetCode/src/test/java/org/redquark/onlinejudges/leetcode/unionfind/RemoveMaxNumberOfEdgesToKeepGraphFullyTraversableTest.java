package org.redquark.onlinejudges.leetcode.unionfind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {

    private final RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable testObject = new RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable();

    @Test
    public void testMaxNumEdgesToRemove() {
        int n = 4;
        int[][] edges = new int[][]{
                {3, 1, 2},
                {3, 2, 3},
                {1, 1, 3},
                {1, 2, 4},
                {1, 1, 2},
                {2, 3, 4}
        };
        assertEquals(2, testObject.maxNumEdgesToRemove(n, edges));

        n = 4;
        edges = new int[][]{
                {3, 1, 2},
                {3, 2, 3},
                {1, 1, 4},
                {2, 1, 4}
        };
        assertEquals(0, testObject.maxNumEdgesToRemove(n, edges));
    }
}