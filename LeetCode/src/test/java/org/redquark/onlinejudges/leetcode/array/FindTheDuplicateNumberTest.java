package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDuplicateNumberTest {

    private final FindTheDuplicateNumber testObject = new FindTheDuplicateNumber();

    @Test
    public void testFindDuplicate() {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        assertEquals(2, testObject.findDuplicate(nums));
    }
}