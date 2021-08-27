package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceTest {

    private final EditDistance testObject = new EditDistance();

    @Test
    public void testMinDistance() {
        String word1 = "horse";
        String word2 = "ros";
        assertEquals(3, testObject.minDistance(word1, word2));

        word1 = "intention";
        word2 = "execution";
        assertEquals(5, testObject.minDistance(word1, word2));
    }
}