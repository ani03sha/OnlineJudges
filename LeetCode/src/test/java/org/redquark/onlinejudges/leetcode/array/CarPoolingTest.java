package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarPoolingTest {

    private final CarPooling testObject = new CarPooling();

    @Test
    public void testCarPooling() {
        int[][] trips = new int[][]{
                {2, 1, 5},
                {3, 3, 7}
        };
        int capacity = 4;
        assertFalse(testObject.carPooling(trips, capacity));

        capacity = 5;
        assertTrue(testObject.carPooling(trips, capacity));
    }
}