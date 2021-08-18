package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    private final ContainsDuplicate testObject = new ContainsDuplicate();

    @Test
    public void testContainsDuplicate() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertTrue(testObject.containsDuplicate(nums));

        nums = new int[]{1, 2, 3, 4};
        assertFalse(testObject.containsDuplicate(nums));

        nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(testObject.containsDuplicate(nums));
    }
}