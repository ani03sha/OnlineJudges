package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberOfCandiesTest {

    private final KidsWithTheGreatestNumberOfCandies testObject = new KidsWithTheGreatestNumberOfCandies();

    @Test
    public void testKidsWithCandies() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertEquals(expected, testObject.kidsWithCandies(candies, extraCandies));

        candies = new int[]{4, 2, 1, 1, 2};
        extraCandies = 1;
        expected = List.of(true, false, false, false, false);
        assertEquals(expected, testObject.kidsWithCandies(candies, extraCandies));
    }
}