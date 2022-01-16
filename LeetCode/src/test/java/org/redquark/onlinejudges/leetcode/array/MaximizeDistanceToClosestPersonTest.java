package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizeDistanceToClosestPersonTest {

    private final MaximizeDistanceToClosestPerson testObject = new MaximizeDistanceToClosestPerson();

    @Test
    public void testMaxDistToClosest() {
        int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, testObject.maxDistToClosest(seats));

        seats = new int[]{1, 0, 0, 0};
        assertEquals(3, testObject.maxDistToClosest(seats));

        seats = new int[]{0, 1};
        assertEquals(1, testObject.maxDistToClosest(seats));
    }
}