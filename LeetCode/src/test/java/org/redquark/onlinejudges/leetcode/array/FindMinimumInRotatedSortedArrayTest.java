package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    private final FindMinimumInRotatedSortedArray testObject = new FindMinimumInRotatedSortedArray();

    @Test
    public void testFindMin() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        assertEquals(1, testObject.findMin(nums));

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, testObject.findMin(nums));

        nums = new int[]{11, 13, 15, 17};
        assertEquals(11, testObject.findMin(nums));

        nums = new int[]{1};
        assertEquals(1, testObject.findMin(nums));

        nums = new int[]{2, 1};
        assertEquals(1, testObject.findMin(nums));
    }
}