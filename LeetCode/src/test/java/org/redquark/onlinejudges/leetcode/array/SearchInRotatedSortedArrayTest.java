package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray testObject = new SearchInRotatedSortedArray();

    @Test
    public void testSearch() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        assertEquals(4, testObject.search(nums, target));

        target = 3;
        assertEquals(-1, testObject.search(nums, target));

        nums = new int[]{1};
        target = 0;
        assertEquals(-1, testObject.search(nums, target));
    }
}