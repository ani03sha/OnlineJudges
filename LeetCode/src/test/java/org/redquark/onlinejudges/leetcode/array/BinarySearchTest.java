package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private final BinarySearch testObject = new BinarySearch();

    @Test
    public void testSearch() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, testObject.search(nums, target));

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        assertEquals(-1, testObject.search(nums, target));
    }
}