package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumValueOfKCoinsFromPilesTest {

    private final MaximumValueOfKCoinsFromPiles testObject = new MaximumValueOfKCoinsFromPiles();

    @Test
    public void testMaxValueOfCoins() {
        List<List<Integer>> piles = new ArrayList<>();
        piles.add(List.of(1, 100, 3));
        piles.add(List.of(7, 8, 9));
        int k = 2;
        assertEquals(101, testObject.maxValueOfCoins(piles, k));

        piles = new ArrayList<>();
        piles.add(List.of(100));
        piles.add(List.of(100));
        piles.add(List.of(100));
        piles.add(List.of(100));
        piles.add(List.of(100));
        piles.add(List.of(100));
        piles.add(List.of(1, 1, 1, 1, 1, 1, 700));
        k = 7;
        assertEquals(706, testObject.maxValueOfCoins(piles, k));
    }
}