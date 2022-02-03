package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourSumIITest {

    private final FourSumII testObject = new FourSumII();

    @Test
    public void testFourSumCount() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};
        assertEquals(2, testObject.fourSumCount(nums1, nums2, nums3, nums4));

        nums1 = new int[]{0};
        nums2 = new int[]{0};
        nums3 = new int[]{0};
        nums4 = new int[]{0};
        assertEquals(1, testObject.fourSumCount(nums1, nums2, nums3, nums4));
    }
}