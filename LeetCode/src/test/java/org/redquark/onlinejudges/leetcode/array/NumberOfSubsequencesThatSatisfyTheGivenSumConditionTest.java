package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {

    private final NumberOfSubsequencesThatSatisfyTheGivenSumCondition testObject = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition();

    @Test
    public void testNumSubseq() {
        int[] nums = new int[]{3, 5, 6, 7};
        int target = 9;
        assertEquals(4, testObject.numSubseq(nums, target));

        nums = new int[]{3, 3, 6, 8};
        target = 10;
        assertEquals(6, testObject.numSubseq(nums, target));

        nums = new int[]{2, 3, 3, 4, 6, 7};
        target = 12;
        assertEquals(61, testObject.numSubseq(nums, target));
    }
}