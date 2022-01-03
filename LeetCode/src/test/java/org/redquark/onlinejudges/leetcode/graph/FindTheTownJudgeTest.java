package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheTownJudgeTest {

    private final FindTheTownJudge testObject = new FindTheTownJudge();

    @Test
    public void testFindJudge() {
        int n = 2;
        int[][] trust = new int[][]{
                {1, 2}
        };
        assertEquals(2, testObject.findJudge(n, trust));

        n = 3;
        trust = new int[][]{
                {1, 3},
                {2, 3}
        };
        assertEquals(3, testObject.findJudge(n, trust));

        trust = new int[][]{
                {1, 3},
                {2, 3},
                {3, 1}
        };
        assertEquals(-1, testObject.findJudge(n, trust));
    }
}