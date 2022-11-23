package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacificAtlanticWaterFlowTest {

    private final PacificAtlanticWaterFlow testObject = new PacificAtlanticWaterFlow();

    @Test
    public void testPacificAtlantic() {
        int[][] heights = new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> expected = List.of(
                Arrays.asList(0, 4),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 2),
                Arrays.asList(3, 0),
                Arrays.asList(3, 1),
                Arrays.asList(4, 0)
        );
        assertEquals(expected, testObject.pacificAtlantic(heights));

        heights = new int[][]{
                {1}
        };
        expected = List.of(Arrays.asList(0, 0));
        assertEquals(expected, testObject.pacificAtlantic(heights));
    }

}