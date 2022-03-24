package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoatsToSavePeopleTest {

    private final BoatsToSavePeople testObject = new BoatsToSavePeople();

    @Test
    public void testNumRescueBoats() {
        int[] people = new int[]{1, 2};
        int limit = 3;
        assertEquals(1, testObject.numRescueBoats(people, limit));

        people = new int[]{3, 5, 3, 4};
        limit = 5;
        assertEquals(4, testObject.numRescueBoats(people, limit));
    }
}