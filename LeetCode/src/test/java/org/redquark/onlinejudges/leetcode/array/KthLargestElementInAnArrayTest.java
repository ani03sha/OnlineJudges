package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray testObject = new KthLargestElementInAnArray();

    @Test
    public void testFindKthLargest() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        assertEquals(5, testObject.findKthLargest(nums, k));

        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        k = 4;
        assertEquals(4, testObject.findKthLargest(nums, k));
    }
}