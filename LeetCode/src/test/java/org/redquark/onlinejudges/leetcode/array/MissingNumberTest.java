package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    private final MissingNumber testObject = new MissingNumber();

    @Test
    public void testMissingNumber() {
        int[] nums = new int[]{3, 0, 1};
        assertEquals(2, testObject.missingNumber(nums));

        nums = new int[]{0, 1};
        assertEquals(2, testObject.missingNumber(nums));

        nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, testObject.missingNumber(nums));
    }
}