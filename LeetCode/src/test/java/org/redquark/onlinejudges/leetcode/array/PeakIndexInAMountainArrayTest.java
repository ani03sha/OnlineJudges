package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeakIndexInAMountainArrayTest {

    private final PeakIndexInAMountainArray testObject = new PeakIndexInAMountainArray();

    @Test
    public void testPeakIndexInMountainArray() {
        int[] nums = new int[]{0, 1, 0};
        assertEquals(1, testObject.peakIndexInMountainArray(nums));

        nums = new int[]{0, 2, 1, 0};
        assertEquals(1, testObject.peakIndexInMountainArray(nums));

        nums = new int[]{0, 10, 5, 2};
        assertEquals(1, testObject.peakIndexInMountainArray(nums));
    }
}