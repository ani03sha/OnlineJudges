package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampagneTowerTest {

    private final ChampagneTower testObject = new ChampagneTower();

    @Test
    public void testChampagneTower() {
        int poured = 1;
        int queryRow = 1;
        int queryGlass = 1;
        assertEquals(0.0, testObject.champagneTower(poured, queryRow, queryGlass));

        poured = 2;
        assertEquals(0.5, testObject.champagneTower(poured, queryRow, queryGlass));

        poured = 100000009;
        queryRow = 33;
        queryGlass = 17;
        assertEquals(1.0, testObject.champagneTower(poured, queryRow, queryGlass));
    }
}