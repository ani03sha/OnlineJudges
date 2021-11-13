package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DailyTemperaturesTest {

    private final DailyTemperatures testObject = new DailyTemperatures();

    @Test
    public void testDailyTemperatures() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, testObject.dailyTemperatures(temperatures));

        temperatures = new int[]{30, 40, 50, 60};
        expected = new int[]{1, 1, 1, 0};
        assertArrayEquals(expected, testObject.dailyTemperatures(temperatures));

        temperatures = new int[]{30, 60, 90};
        expected = new int[]{1, 1, 0};
        assertArrayEquals(expected, testObject.dailyTemperatures(temperatures));

        temperatures = new int[]{89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        expected = new int[]{8, 1, 5, 4, 3, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, testObject.dailyTemperatures(temperatures));
    }
}