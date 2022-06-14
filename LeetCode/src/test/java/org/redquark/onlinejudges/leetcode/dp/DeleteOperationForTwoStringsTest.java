package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteOperationForTwoStringsTest {

    private final DeleteOperationForTwoStrings testObject = new DeleteOperationForTwoStrings();

    @Test
    public void testMinDistance() {
        String word1 = "sea";
        String word2 = "eat";
        assertEquals(2, testObject.minDistance(word1, word2));

        word1 = "leetcode";
        word2 = "etco";
        assertEquals(4, testObject.minDistance(word1, word2));
    }
}