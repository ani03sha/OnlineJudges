package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {

    private final Candy testObject = new Candy();

    @Test
    public void testCandy() {
        int[] ratings = new int[]{1, 0, 2};
        assertEquals(5, testObject.candy(ratings));

        ratings = new int[]{1, 2, 2};
        assertEquals(4, testObject.candy(ratings));
    }
}