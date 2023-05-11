package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UncrossedLinesTest {

    private final UncrossedLines testObject = new UncrossedLines();

    @Test
    public void testMaxUncrossedLines() {
        int[] nums1 = new int[]{1, 4, 2};
        int[] nums2 = new int[]{1, 2, 4};
        assertEquals(2, testObject.maxUncrossedLines(nums1, nums2));

        nums1 = new int[]{2, 5, 1, 2, 5};
        nums2 = new int[]{10, 5, 2, 1, 5, 2};
        assertEquals(3, testObject.maxUncrossedLines(nums1, nums2));

        nums1 = new int[]{1, 3, 7, 1, 7, 5};
        nums2 = new int[]{1, 9, 2, 5, 1};
        assertEquals(2, testObject.maxUncrossedLines(nums1, nums2));
    }
}