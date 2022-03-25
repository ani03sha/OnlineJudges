package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoCitySchedulingTest {

    private final TwoCityScheduling testObject = new TwoCityScheduling();

    @Test
    public void testTwoCitySchedCost() {
        int[][] costs = new int[][]{
                {10, 20},
                {30, 200},
                {400, 50},
                {30, 20}
        };
        assertEquals(110, testObject.twoCitySchedCost(costs));

        costs = new int[][]{
                {259, 770},
                {448, 54},
                {926, 667},
                {184, 139},
                {840, 118},
                {577, 469}
        };
        assertEquals(1859, testObject.twoCitySchedCost(costs));

        costs = new int[][]{
                {515, 563},
                {451, 713},
                {537, 709},
                {343, 819},
                {855, 779},
                {457, 60},
                {650, 359},
                {631, 42}
        };
        assertEquals(3086, testObject.twoCitySchedCost(costs));
    }
}