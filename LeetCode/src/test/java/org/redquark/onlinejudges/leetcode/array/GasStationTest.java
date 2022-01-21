package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasStationTest {

    private final GasStation testObject = new GasStation();

    @Test
    public void testCanCompleteCircuit() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        assertEquals(3, testObject.canCompleteCircuit(gas, cost));

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        assertEquals(-1, testObject.canCompleteCircuit(gas, cost));
    }
}