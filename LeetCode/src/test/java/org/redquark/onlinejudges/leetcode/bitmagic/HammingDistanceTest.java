package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HammingDistanceTest {

    private final HammingDistance testObject = new HammingDistance();

    @Test
    public void testHammingDistance() {
        assertEquals(2, testObject.hammingDistance(1, 4));
        assertEquals(1, testObject.hammingDistance(1, 3));
    }
}