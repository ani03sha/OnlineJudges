package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimilarStringGroupsTest {

    private final SimilarStringGroups testObject = new SimilarStringGroups();

    @Test
    public void testNumSimilarGroups() {
        String[] strs = new String[]{"tars", "rats", "arts", "star"};
        assertEquals(2, testObject.numSimilarGroups(strs));

        strs = new String[]{"omv", "ovm"};
        assertEquals(1, testObject.numSimilarGroups(strs));
    }
}