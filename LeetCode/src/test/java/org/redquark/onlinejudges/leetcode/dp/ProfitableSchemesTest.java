package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfitableSchemesTest {

    private final ProfitableSchemes testObject = new ProfitableSchemes();

    @Test
    public void testProfitableSchemes() {
        int n = 5;
        int minProfit = 3;
        int[] group = new int[]{2, 2};
        int[] profit = new int[]{2, 3};
        assertEquals(2, testObject.profitableSchemes(n, minProfit, group, profit));

        n = 10;
        minProfit = 5;
        group = new int[]{2, 3, 5};
        profit = new int[]{6, 7, 8};
        assertEquals(7, testObject.profitableSchemes(n, minProfit, group, profit));
    }
}