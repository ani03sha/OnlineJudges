package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays testObject = new MedianOfTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        assertEquals(2.0, testObject.findMedianSortedArrays(nums1, nums2));

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        assertEquals(2.5, testObject.findMedianSortedArrays(nums1, nums2));

    }
}