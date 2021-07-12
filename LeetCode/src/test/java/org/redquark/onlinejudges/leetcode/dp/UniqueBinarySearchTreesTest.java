package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueBinarySearchTreesTest {

    private final UniqueBinarySearchTrees testObject = new UniqueBinarySearchTrees();

    @Test
    public void testNumTrees() {
        assertEquals(5, testObject.numTrees(3));
        assertEquals(1, testObject.numTrees(1));
    }
}