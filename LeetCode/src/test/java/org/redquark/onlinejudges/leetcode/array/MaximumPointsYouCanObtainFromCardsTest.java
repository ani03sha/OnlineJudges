package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumPointsYouCanObtainFromCardsTest {

    private final MaximumPointsYouCanObtainFromCards testObject = new MaximumPointsYouCanObtainFromCards();

    @Test
    public void testMaxScore() {
        int[] cardPoints = new int[]{1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        assertEquals(12, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{2, 2, 2};
        k = 2;
        assertEquals(4, testObject.maxScore(cardPoints, k));

        cardPoints = new int[]{9, 7, 7, 9, 7, 7, 9};
        k = 7;
        assertEquals(55, testObject.maxScore(cardPoints, k));
    }
}