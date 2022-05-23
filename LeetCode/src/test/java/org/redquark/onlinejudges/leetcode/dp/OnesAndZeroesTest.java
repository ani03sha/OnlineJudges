package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnesAndZeroesTest {

    private final OnesAndZeroes testObject = new OnesAndZeroes();

    @Test
    void findMaxFormWithRecursion() {
        String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, testObject.findMaxFormWithRecursion(strs, m, n));

        strs = new String[]{"10", "0", "1"};
        m = 1;
        n = 1;
        assertEquals(2, testObject.findMaxFormWithRecursion(strs, m, n));
    }

    @Test
    public void findMaxFormWithDP() {
        String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, testObject.findMaxFormWithDP(strs, m, n));

        strs = new String[]{"10", "0", "1"};
        m = 1;
        n = 1;
        assertEquals(2, testObject.findMaxFormWithDP(strs, m, n));
    }

    @Test
    public void findMaxFormWithMemoization() {
        String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, testObject.findMaxFormWithMemoization(strs, m, n));

        strs = new String[]{"10", "0", "1"};
        m = 1;
        n = 1;
        assertEquals(2, testObject.findMaxFormWithMemoization(strs, m, n));
    }
}