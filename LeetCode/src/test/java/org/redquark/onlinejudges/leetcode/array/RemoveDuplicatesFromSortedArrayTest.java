package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    private final removeDuplicatesFromSortedArray testObject = new removeDuplicatesFromSortedArray();

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, testObject.removeDuplicates(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, testObject.removeDuplicates(nums));
    }
}