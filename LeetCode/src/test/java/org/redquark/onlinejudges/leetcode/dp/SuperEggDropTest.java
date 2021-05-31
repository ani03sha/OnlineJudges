package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperEggDropTest {

    private final SuperEggDrop testObject = new SuperEggDrop();

    @Test
    public void testSuperEggDrop() {
        int k = 1;
        int n = 2;
        assertEquals(2, testObject.superEggDrop(k, n));

        k = 2;
        n = 6;
        assertEquals(3, testObject.superEggDrop(k, n));

        k = 3;
        n = 14;
        assertEquals(4, testObject.superEggDrop(k, n));
    }
}