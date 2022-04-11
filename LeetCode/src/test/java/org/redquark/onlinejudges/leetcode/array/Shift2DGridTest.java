package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Shift2DGridTest {

    private final Shift2DGrid testObject = new Shift2DGrid();

    @Test
    public void testShiftGrid() {
        int[][] grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(9, 1, 2));
        expected.add(Arrays.asList(3, 4, 5));
        expected.add(Arrays.asList(6, 7, 8));
        assertEquals(expected, testObject.shiftGrid(grid, k));

        grid = new int[][]{
                {3, 8, 1, 9},
                {19, 7, 2, 5},
                {4, 6, 11, 10},
                {12, 0, 21, 13}
        };
        k = 4;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(12, 0, 21, 13));
        expected.add(Arrays.asList(3, 8, 1, 9));
        expected.add(Arrays.asList(19, 7, 2, 5));
        expected.add(Arrays.asList(4, 6, 11, 10));
        assertEquals(expected, testObject.shiftGrid(grid, k));

        grid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        k = 9;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(4, 5, 6));
        expected.add(Arrays.asList(7, 8, 9));
        assertEquals(expected, testObject.shiftGrid(grid, k));
    }
}