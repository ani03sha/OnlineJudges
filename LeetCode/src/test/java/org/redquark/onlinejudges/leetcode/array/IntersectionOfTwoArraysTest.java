package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysTest {

    private final IntersectionOfTwoArrays testObject = new IntersectionOfTwoArrays();

    @Test
    public void testIntersection() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2};
        assertArrayEquals(expected, testObject.intersection(nums1, nums2));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        expected = new int[]{4, 9};
        assertArrayEquals(expected, testObject.intersection(nums1, nums2));
    }
}