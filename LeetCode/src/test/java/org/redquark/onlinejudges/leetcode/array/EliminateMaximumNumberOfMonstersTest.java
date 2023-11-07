package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EliminateMaximumNumberOfMonstersTest {

    private final EliminateMaximumNumberOfMonsters testObject =
            new EliminateMaximumNumberOfMonsters();

    @Test
    public void testEliminateMaximum() {
        int[] distance = new int[]{1, 3, 4};
        int[] speed = new int[]{1, 1, 1};
        assertEquals(3, testObject.eliminateMaximum(distance, speed));

        distance = new int[]{1, 1, 2, 3};
        speed = new int[]{1, 1, 1, 1};
        assertEquals(1, testObject.eliminateMaximum(distance, speed));

        distance = new int[]{3, 2, 4};
        speed = new int[]{5, 3, 2};
        assertEquals(1, testObject.eliminateMaximum(distance, speed));
    }
}