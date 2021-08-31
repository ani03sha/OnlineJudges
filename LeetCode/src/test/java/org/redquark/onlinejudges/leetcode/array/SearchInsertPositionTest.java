package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    private final SearchInsertPosition testObject = new SearchInsertPosition();

    @Test
    public void testSearchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        assertEquals(2, testObject.searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 2;
        assertEquals(1, testObject.searchInsert(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        assertEquals(4, testObject.searchInsert(nums, target));
    }
}