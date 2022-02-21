package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    private final MajorityElement testObject = new MajorityElement();

    @Test
    public void testMajorityElement() {
        int[] nums = new int[]{3, 2, 3};
        assertEquals(3, testObject.majorityElement(nums));

        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, testObject.majorityElement(nums));
    }
}