package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dota2SenateTest {

    private final Dota2Senate testObject = new Dota2Senate();

    @Test
    public void testPredictPartyVictory() {
        assertEquals("Radiant", testObject.predictPartyVictory("RD"));
        assertEquals("Dire", testObject.predictPartyVictory("RDD"));
    }
}