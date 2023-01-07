package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

    private final NumberOfIslands testObject = new NumberOfIslands();

    @Test
    public void testGetNumberOfIslands() {
        int[][] surface = new int[][]{
                {1, 1, 0, 1},
                {1, 0, 1, 1},
                {0, 1, 0, 1}
        };
        assertEquals(3, testObject.getNumberOfIslands(surface));
    }
}