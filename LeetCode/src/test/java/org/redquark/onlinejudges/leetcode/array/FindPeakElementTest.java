package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {

    private final FindPeakElement testObject = new FindPeakElement();

    @Test
    public void testFindPeakElement() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertEquals(2, testObject.findPeakElement(nums));

        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        assertEquals(5, testObject.findPeakElement(nums));
    }
}