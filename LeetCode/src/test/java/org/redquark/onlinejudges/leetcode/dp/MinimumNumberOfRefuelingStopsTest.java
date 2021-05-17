package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfRefuelingStopsTest {

    private final MinimumNumberOfRefuelingStops testObject = new MinimumNumberOfRefuelingStops();

    @Test
    public void testMinRefuelStops() {
        int target = 1;
        int startFuel = 1;
        int[][] stations = new int[][]{};
        assertEquals(0, testObject.minRefuelStops(target, startFuel, stations));

        target = 100;
        startFuel = 1;
        stations = new int[][]{{10, 100}};
        assertEquals(-1, testObject.minRefuelStops(target, startFuel, stations));

        target = 100;
        startFuel = 10;
        stations = new int[][]{
                {10, 60},
                {20, 30},
                {30, 30},
                {60, 40}
        };
        assertEquals(2, testObject.minRefuelStops(target, startFuel, stations));
    }
}