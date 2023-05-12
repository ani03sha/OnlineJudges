package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolvingQuestionsWithBrainpowerTest {

    private final SolvingQuestionsWithBrainpower testObject = new SolvingQuestionsWithBrainpower();

    @Test
    public void testMostPoints() {
        int[][] questions = new int[][]{
                {3, 2},
                {4, 3},
                {4, 4},
                {2, 5}
        };
        assertEquals(5, testObject.mostPoints(questions));

        questions = new int[][]{
                {1, 1},
                {2, 2},
                {3, 3},
                {4, 4},
                {5, 5}
        };
        assertEquals(7, testObject.mostPoints(questions));
    }
}