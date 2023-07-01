package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairDistributionOfCookiesTest {

    private final FairDistributionOfCookies testObject = new FairDistributionOfCookies();

    @Test
    public void testDistributeCookies() {
        int[] cookies = new int[]{8, 15, 10, 20, 8};
        int k = 2;
        assertEquals(31, testObject.distributeCookies(cookies, k));

        cookies = new int[]{6, 1, 3, 2, 2, 4, 1, 2};
        k = 3;
        assertEquals(7, testObject.distributeCookies(cookies, k));
    }
}