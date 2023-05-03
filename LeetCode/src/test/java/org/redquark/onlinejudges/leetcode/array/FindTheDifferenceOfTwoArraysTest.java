package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceOfTwoArraysTest {

    private final FindTheDifferenceOfTwoArrays testObject = new FindTheDifferenceOfTwoArrays();

    @Test
    public void testFindDifference() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 3));
        expected.add(List.of(4, 6));
        assertEquals(expected, testObject.findDifference(nums1, nums2));

        nums1 = new int[]{1, 2, 3, 3};
        nums2 = new int[]{1, 1, 2, 2};
        expected = new ArrayList<>();
        expected.add(List.of(3));
        expected.add(List.of());
        assertEquals(expected, testObject.findDifference(nums1, nums2));
    }
}