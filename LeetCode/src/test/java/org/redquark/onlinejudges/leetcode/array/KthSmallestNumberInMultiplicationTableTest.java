package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestNumberInMultiplicationTableTest {

    private final KthSmallestNumberInMultiplicationTable testObject = new KthSmallestNumberInMultiplicationTable();

    @Test
    public void testFindKthNumber() {
        assertEquals(3, testObject.findKthNumber(3, 3, 5));
        assertEquals(6, testObject.findKthNumber(2, 3, 6));
    }
}