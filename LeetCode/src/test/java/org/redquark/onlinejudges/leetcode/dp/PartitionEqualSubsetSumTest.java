package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartitionEqualSubsetSumTest {

    private final PartitionEqualSubsetSum testObject = new PartitionEqualSubsetSum();

    @Test
    public void testCanPartition() {
        int[] nums = new int[]{1, 5, 11, 5};
        assertTrue(testObject.canPartition(nums));

        nums = new int[]{1, 2, 3, 5};
        assertFalse(testObject.canPartition(nums));
    }
}